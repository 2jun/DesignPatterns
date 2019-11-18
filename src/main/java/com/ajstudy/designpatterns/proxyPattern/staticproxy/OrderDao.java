package com.ajstudy.designpatterns.proxyPattern.staticproxy;

/**
 * @ClassName: OrderDao
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-05  9:26
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建Order 成功!");
        return 1;
    }
}
