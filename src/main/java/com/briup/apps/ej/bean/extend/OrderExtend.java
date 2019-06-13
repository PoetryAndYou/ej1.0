package com.briup.apps.ej.bean.extend;

import com.briup.apps.ej.bean.*;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-11-8:24
 */
public class OrderExtend extends Order {
    private Comment comment;  //评论

    private Address address;  //地址

    private Customer customer;  //客户

    private Waiter waiter;   //员工
    private List<OrderLine> orderLines;

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
