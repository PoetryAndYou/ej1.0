package com.briup.apps.ej.bean.extend;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.Product;

/**
 * @author rui
 * @create 2019-06-13 9:23
 */
public class OrderLineExtend extends OrderLine {
    private Order order;
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
