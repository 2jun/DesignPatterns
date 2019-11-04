package com.ajstudy.designpatterns.Singleton.ContainerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: aiJun
 * @desc:容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
 * @Date: 2019-11-04 10:22
 * @Version 1.0
 */
//注册式单例，容器缓存的写法
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String beanName) {
        if (!ioc.containsKey(beanName)) {

            try {
                Object obj = Class.forName(beanName).newInstance();
                ioc.put(beanName, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return ioc.get(beanName);
    }

}
