package com.ajstudy.designpatterns.proxyPattern;

/**
 * @ClassName: OrderService
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-05  9:29
 */
public class OrderService implements IOrderService {

    private final OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用orderDao 创建订单");
        return orderDao.insert(order);
    }
}
