package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderService {
    List<Order> findAll();//查询所有订单

}
