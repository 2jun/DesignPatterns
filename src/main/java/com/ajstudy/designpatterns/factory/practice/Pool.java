package com.ajstudy.designpatterns.factory.practice;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 自定义连接池getInstance()返回POOL 唯一实例,第一次调用时将执行构造函数
 * 构造函数Pool()调用驱动装载loadDrivers()函数;连接池创建createPool()函数loadDrivers()装载驱动
 * createPool()建连接池getConnection()返回一个连接实例getConnection(long time)添加时间限制
 * freeConnection(Connection con)将con 连接实例返回到连接池getnum()返回空闲连接数
 * getnumActive()返回当前使用的连接数
 *
 * @Author: aiJun
 * @Date: 2019-10-31 20:14
 * @Version 1.0
 */
public abstract class Pool {
    public String propertiesName = "/application.properties";
    private static Pool instance = null; // 定义唯一实例
    /**
     * 最大连接数
     */
    protected int maxConnect = 100; // 最大连接数
    /**
     * 保持连接数
     */
    protected int normalConnect = 10; // 保持连接数
    /**
     * 驱动字符串
     */
    protected String driverName = null; // 驱动字符串
    /**
     * 驱动类
     */
    protected Driver driver = null; // 驱动变量

    /**
     * 私有构造函数,不允许外界访问
     */
    protected Pool() {
        try {
            init();
            loadDrivers(driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化所有从配置文件中读取的成员变量成员变量
     */
    private void init() throws IOException {
        InputStream is = Pool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    /**
     * 装载和注册所有JDBC 驱动程序
     * 咕泡出品，必属精品www.gupaoedu.com
     * 34
     *
     * @param dri 接受驱动字符串
     */
    protected void loadDrivers(String dri) {
        String driverClassName = dri;
        try {
            driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);
            System.out.println("成功注册JDBC 驱动程序" + driverClassName);
        } catch (Exception e) {
            System.out.println("无法注册JDBC 驱动程序:" + driverClassName + ",错误:" + e);
        }
    }

    /**
     * 创建连接池
     */
    public abstract void createPool();

    /**
     * (单例模式)返回数据库连接池Pool 的实例
     *
     * @param driverName 数据库驱动字符串
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static synchronized Pool getInstance() throws IOException,
            InstantiationException, IllegalAccessException,
            ClassNotFoundException {
        if (instance == null) {
            instance.init();
            instance = (Pool) Class.forName("org.e_book.sqlhelp.Pool")
                    .newInstance();
        }
        return instance;
    }

    /**
     * 获得一个可用的连接,如果没有则创建一个连接,且小于最大连接限制
     *
     * @return 咕泡出品，必属精品www.gupaoedu.com
     * 35
     */
    public abstract Connection getConnection();

    /**
     * 获得一个连接,有时间限制
     *
     * @param time 设置该连接的持续时间(以毫秒为单位)
     * @return
     */
    public abstract Connection getConnection(long time);

    /**
     * 将连接对象返回给连接池
     *
     * @param con 获得连接对象
     */
    public abstract void freeConnection(Connection con);

    /**
     * 返回当前空闲连接数
     *
     * @return
     */
    public abstract int getnum();

    /**
     * 返回当前工作的连接数
     *
     * @return
     */
    public abstract int getnumActive();

    /**
     * 关闭所有连接,撤销驱动注册(此方法为单例方法)
     */
    protected synchronized void release() {
// /撤销驱动
        try {
            DriverManager.deregisterDriver(driver);
            System.out.println("撤销JDBC 驱动程序" + driver.getClass().getName());
        } catch (SQLException e) {
            System.out
                    .println("无法撤销JDBC 驱动程序的注册:" + driver.getClass().getName());
        }
    }
}
