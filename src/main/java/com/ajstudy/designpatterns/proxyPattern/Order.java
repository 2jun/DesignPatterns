package com.ajstudy.designpatterns.proxyPattern;

import lombok.Data;

/**
 * @ClassName: Order
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-05  9:26
 */
@Data
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;
}
