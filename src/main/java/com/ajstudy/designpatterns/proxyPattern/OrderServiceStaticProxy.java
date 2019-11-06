package com.ajstudy.designpatterns.proxyPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: OrderServiceStaticProxy
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-06  8:48
 */
public class OrderServiceStaticProxy implements IOrderService{
    private OrderService orderService;
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long createTime = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(createTime)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void before(){
        System.out.println("Proxy before method.");
    }
    private void after(){
        System.out.println("Proxy after method.");
    }
}
