package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderExample;
import com.briup.apps.ej.dao.OrderMapper;
import com.briup.apps.ej.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IOrderServiceImpl implements IOrderService {
    @Resource
    private OrderMapper orderMapper;

    /**
     * 查询所有订单
     * @return
     * @param
     */
    @Override
    public List<Order> findAll() {
        OrderExample example = new OrderExample();
        return orderMapper.selectByExample(example);
    }
}
