package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderExample;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.dao.OrderMapper;
import com.briup.apps.ej.dao.extend.OrderExtendMapper;
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
    @Resource
    private OrderExtendMapper orderExtendMapper;

    /**
     * 查询所有订单
     *
     * @param
     * @return
     */
    @Override
    public List<Order> findAll() {
        OrderExample example = new OrderExample();
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<OrderExtend> findAllComment(Long id) {
        return orderExtendMapper.findAllComment(id);
    }

    @Override
    public List<OrderExtend> findAllAddress(Long id) {
        return orderExtendMapper.findAllAddress(id);
    }

    @Override
    public List<OrderExtend> findAllCustomer(Long id) {
        return orderExtendMapper.findAllCustomer(id);
    }

    @Override
    public List<OrderExtend> findAllWaiter(Long id) {
        return orderExtendMapper.findAllWaiter(id);
    }

    @Override
    public void saveOrupdate(Order order) throws Exception {
        if (order.getId() == null) {
            orderMapper.insert(order);
        } else {
            orderMapper.updateByPrimaryKey(order);

        }

    }

    @Override
    public void deleteOrder(Long id) throws Exception {
        Order order = findById(id);
        if (order == null) {
            throw new Exception("要删除的order不存在");
        } else {
            orderMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Order findById(Long id) {
        OrderExample example = new OrderExample();
        return orderMapper.selectByPrimaryKey(id);

    }

    @Override
    public void batchDeletion(Long[] ids) throws Exception {
        for (Long id : ids
        ) {
            deleteOrder(id);
        }
    }


}
