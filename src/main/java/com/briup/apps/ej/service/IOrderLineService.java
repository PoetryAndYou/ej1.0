package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderLine;



/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderLineService {
    OrderLine findOrder(Long id);//查询
    //更新添加
    void saveOrupdate(OrderLine orderLine) throws Exception;
    //删除
    void delete(Long id) throws Exception;
    //批量删除
    void batchDeletion(Long[] ids)throws Exception;

}
