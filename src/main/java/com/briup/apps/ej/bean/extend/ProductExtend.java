package com.briup.apps.ej.bean.extend;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.Product;

/**
 * @author rui
 * @create 2019-06-11 16:41
 */
public class ProductExtend extends Product {
    private OrderLine orderLine;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
