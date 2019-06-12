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
@RequestMapping("/order")

public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("/findAll")
    @ApiOperation("查询所有订单")
    public Message findAll() {
        List<Order> list = orderService.findAll();
        return MessageUtil.success("sucess", list);
    }
    @ApiOperation("通过订单查询用户该订单的所有评价信息")
    @GetMapping("findAllComment")
    public Message findAllComment(Long id){
        List<OrderExtend> list = orderService.findAllComment(id);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过订单查询该用户的所有地址信息")
    @GetMapping("findAllAddress")
    public Message findAllAddress(Long id){
        List<OrderExtend> list = orderService.findAllAddress(id);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过订单查询该订单的用户信息")
    @GetMapping("findAllCustomer")
    public Message findAllCustomer(Long id){
        List<OrderExtend> list = orderService.findAllCustomer(id);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过订单查询员工信息")
    @GetMapping("findAllWaiter")
    public Message findAllWaiter(Long id){
        List<OrderExtend> list = orderService.findAllWaiter(id);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("创建新订单")
    @GetMapping("creNewOrd")
    public Message  creNewOrd(Order order){
        int a=orderService.creNewOrd(order);
        return MessageUtil.message("创建成功");
    }
}
