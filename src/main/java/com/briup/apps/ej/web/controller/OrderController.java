package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.service.IOrderService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:42
 */
@RestController
@RequestMapping("/OrderController")

public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("/findAll")
    @ApiOperation("查询所有订单")
    public Message findAll() {
        List<Order> list = orderService.findAll();
        return MessageUtil.success("sucess", list);
    }
    @ApiOperation("查询订单的所有评价信息")
    @GetMapping("findAllComment")
    public Message findAllComment(Long id){
        List<OrderExtend> list = orderService.findAllComment(id);
        return MessageUtil.success("success",list);
    }
}
