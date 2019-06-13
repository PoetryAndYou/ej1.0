package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.OrderLine;
import com.briup.apps.ej.bean.extend.OrderLineExtend;
import com.briup.apps.ej.service.IOrderLineService;
import com.briup.apps.ej.service.IOrderService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:42
 */
@RestController
@RequestMapping("/orderLine")

public class OrderLineController {
    @Autowired
    private IOrderLineService orderLineService;

    @GetMapping("/findOrder")
    @ApiOperation("根据id查询订单链接")
    public Message findOrder(Long id) {
        OrderLine ord = orderLineService.findOrder(id);
        return MessageUtil.success("success", ord);
    }

    @GetMapping("/saveOrupdate")
    @ApiOperation("更新或插入")
    public Message saveOrUpdate(OrderLine orderLine) throws Exception {
        orderLineService.saveOrupdate(orderLine);
        return MessageUtil.message("更新或插入成功");
    }

    @GetMapping("/delete")
    @ApiOperation("删除orderline")
    public Message delete(Long id) throws Exception {
        orderLineService.delete(id);
        return MessageUtil.message("删除成功");
    }

    @ApiOperation("批量删除")
    @PostMapping("batchDeletion")
    public Message batchDeletion(Long[] ids) throws Exception {
        orderLineService.batchDeletion(ids);
        return MessageUtil.message("删除成功");
    }
    @ApiOperation("通过订单项id查询所有订单")
    @PostMapping("selectById")
    public Message selectById(Long id) throws Exception {
        List<OrderLineExtend> list=orderLineService.selectById(id);
        return MessageUtil.success("查询成功",list);
    }
}
