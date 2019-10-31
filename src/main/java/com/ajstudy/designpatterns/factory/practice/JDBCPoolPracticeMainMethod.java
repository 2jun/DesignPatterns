package com.ajstudy.designpatterns.factory.practice;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */
//利用工厂模式重构的实践案例
//        还是演示课堂开始的JDBC 操作案例，我们每次操作是不是都需要重新创建数据库连接，
//        每次创建其实都非常耗费性能，消耗业务调用时间。我们利用工厂模式，将数据库连接
//        预先创建好放到容器中缓存着，在业务调用时就只需现取现用。接下来我们来看这段代
//        码：
public class JDBCPoolPracticeMainMethod {
    public static void main(String[] args) {
        DBConnectionPool instance = DBConnectionPool.getInstance();
        instance.createPool();
    }
}
