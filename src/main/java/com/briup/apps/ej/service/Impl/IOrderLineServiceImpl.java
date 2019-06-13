package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.OrderLineExample;
import com.briup.apps.ej.dao.OrderLineMapper;
import com.briup.apps.ej.dao.OrderMapper;
import com.briup.apps.ej.service.IOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IOrderLineServiceImpl implements IOrderLineService {
    @Resource
    private OrderLineMapper orderLineMapper;
    @Resource
    private OrderMapper orderMapper;

    @Override
    public OrderLine findOrder(Long id) {
        OrderLineExample example = new OrderLineExample();
        return orderLineMapper.selectByPrimaryKey(id);
    }


    @Override
    public void saveOrupdate(OrderLine orderLine) throws Exception{

        if (orderLine.getId() == null) {
            orderMapper.insert(new Order());
            orderLineMapper.insert(orderLine);

        } else {
            orderLineMapper.updateByPrimaryKey(orderLine);
        }
    }

    @Override
    public void delete(Long id) throws Exception {
        OrderLine orderLine = findOrder(id);
        if (orderLine == null) {
            throw new Exception("该orderline不存在");
        } else {
            orderLineMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void batchDeletion(Long[] ids) throws Exception {
        for (Long id : ids
        ) {
            delete(id);
        }
    }
}
