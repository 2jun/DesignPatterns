package com.ajstudy.designpatterns.proxyPattern.dynamicproxy.cglibproxy;

import com.ajstudy.designpatterns.proxyPattern.dynamicproxy.jdkproxy.Customer;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @ClassName: CglibTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-21  15:58
 * 目录下的三个文件是 生成的代理类
 *
 * CGLib 动态代理执行代理方法效率之所以比JDK 的高是因为Cglib 采用了FastClass 机
 * 制，它的原理简单来说就是：为代理类和被代理类各生成一个Class，这个Class 会为代
 * 理类或被代理类的方法分配一个index(int 类型)。这个index 当做一个入参，FastClass
 * 就可以直接定位要调用的方法直接进行调用，这样省去了反射调用，所以调用效率比JDK
 * 动态代理通过反射调用高。
 *
 * @see   CGLib 和JDK 动态代理对比
 * 1.JDK 动态代理是实现了被代理对象的接口，CGLib 是继承了被代理对象。
 * 2.JDK 和CGLib 都是在运行期生成字节码，JDK 是直接写Class 字节码，CGLib 使用ASM
 * 框架写Class 字节码，Cglib 代理实现更复杂，生成代理类比JDK 效率低。
 * 3.JDK 调用代理方法，是通过反射机制调用，CGLib 是通过FastClass 机制直接调用方法，
 * CGLib 执行效率更高。
 *
 * Spring 利用动态代理实现AOP 有两个非常重要的类，一个是JdkDynamicAopProxy 类
 * 和CglibAopProxy 类
 */
public class CglibTest {
    public static void main(String[] args) {

        try {
            //利用cglib 的代理类可以将内存中的class 文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                    "E://cglib_proxy_class/");
            Customer instance = (Customer) new CglibMeipo().getInstance(Customer.class);
            instance.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
