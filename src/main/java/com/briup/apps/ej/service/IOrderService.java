package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.VM.OrderAndOrderLineVM;
import com.briup.apps.ej.bean.VM.OrderVM;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.bean.extend.OrderLineExtend;
import org.apache.ibatis.annotations.Param;

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
    void deleteById(Long id) throws Exception;

    //查询订单
    Order findById(Long id);

    //批量删除
    void batchDelete(long[] ids) throws Exception;

    List<OrderExtend> query(Long customerId, Long waiterId);
    List<OrderVM> queryBasic(Long customerId, Long waiterId);
    void save(OrderAndOrderLineVM order) throws Exception;
    Double Add(int number, Long productId);//查询价值
}
