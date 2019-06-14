package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderExample;
import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.VM.OrderAndOrderLineVM;
import com.briup.apps.ej.bean.VM.OrderVM;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.dao.OrderLineMapper;
import com.briup.apps.ej.dao.OrderMapper;
import com.briup.apps.ej.dao.extend.OrderExtendMapper;
import com.briup.apps.ej.service.IOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    @Resource
    private OrderLineMapper orderLineMapper;

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
    public void deleteById(Long id) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(id);
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
    public void batchDelete(long[] ids) throws Exception {
        for (Long id : ids) {
            orderMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<OrderExtend> query(Long customerId, Long waiterId) {
        return orderExtendMapper.query(customerId, waiterId);
    }

    @Override
    public List<OrderVM> queryBasic(Long customerId, Long waiterId) {
        return orderExtendMapper.queryBasic(customerId, waiterId);
    }

    @Override
    public void save(OrderAndOrderLineVM order) throws Exception {
        Double sum = 0.0;
        Order o = new Order();
        o.setOrderTime(new Date().getTime());
        //o.setTotal();//钱
        o.setCustomerId(order.getCustomerId());
        o.setAddressId(order.getAddressId());
        orderMapper.insert(o);


        List<OrderLine> list = order.getOrderLines();

        for (OrderLine slist : list
        ) {

           sum+= Add(slist.getNumber(), slist.getProductId());


          /*  int number = slist.getNumber();
            Long productId = slist.getProductId();*/


            slist.setOrderId(o.getId());
            orderLineMapper.insert(slist);
        }
    }

    public Double  Add(int number, Long productId) {
       return orderExtendMapper.Add(number, productId);
    }


}
