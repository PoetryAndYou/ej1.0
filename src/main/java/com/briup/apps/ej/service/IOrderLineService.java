package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.extend.OrderLineExtend;

import java.util.List;


/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderLineService {
    OrderLine findOrder(Long id);//查询

    //更新添加
    void saveOrupdate(OrderLine orderLine) throws Exception;

    //删除
    void deleteById(Long id) throws Exception;

    //批量删除
    void batchDelete(Long[] ids) throws Exception;

    //通过订单项查询产品和订单信息
    List<OrderLineExtend> selectById(Long id) throws Exception;
}
