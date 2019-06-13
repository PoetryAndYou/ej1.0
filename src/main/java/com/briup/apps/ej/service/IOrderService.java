package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.extend.OrderExtend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderService {
    List<Order> findAll();//查询所有订单

    List<OrderExtend> findAllComment(Long id);

    List<OrderExtend> findAllAddress(Long id);

    List<OrderExtend> findAllCustomer(Long id);

    List<OrderExtend> findAllWaiter(Long id);

    //创建新订单
    void saveOrupdate(Order order) throws Exception;
    //    删除order
    void deleteOrder(Long id)  throws Exception;
    //查询订单
    Order findById(Long id);
    //批量删除
    void batchDeletion(Long[] ids)throws Exception;


}
