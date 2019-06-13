package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.service.IOrderService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public Message findAllComment(Long id) {
        List<OrderExtend> list = orderService.findAllComment(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询该用户的所有地址信息")
    @GetMapping("findAllAddress")
    public Message findAllAddress(Long id) {
        List<OrderExtend> list = orderService.findAllAddress(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询该订单的用户信息")
    @GetMapping("findAllCustomer")
    public Message findAllCustomer(Long id) {
        List<OrderExtend> list = orderService.findAllCustomer(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询员工信息")
    @GetMapping("findAllWaiter")
    public Message findAllWaiter(Long id) {
        List<OrderExtend> list = orderService.findAllWaiter(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("创建或更新订单")
    @PostMapping("saveOrupdate")
    public Message saveOrUpdate(@Valid @ModelAttribute Order order) throws Exception {
        orderService.saveOrupdate(order);
        return MessageUtil.message("成功");
    }

    @ApiOperation("删除订单")
    @GetMapping("deleteById")
    public Message deleteById(@NotNull @RequestParam("id")Long id) throws Exception {
        orderService.deleteById(id);
        return MessageUtil.message("删除成功");
    }

    @ApiOperation("查询订单")
    @GetMapping("findById")
    public Message findById(Long id) throws Exception {
        Order order = orderService.findById(id);
        return MessageUtil.success("sucess", order);
    }

    @ApiOperation("批量删除")
    @PostMapping("batchDelete")
    public Message batchDelete(Long[] ids) throws Exception {
        orderService.batchDelete(ids);
        return MessageUtil.message("删除成功");
    }

    @ApiOperation("查询订单信息，并且订单级联关联属性")
    @GetMapping("query")
    public Message query(Long customerId, Long waiterId) {
        List<OrderExtend> list = orderService.query(customerId, waiterId);
        return MessageUtil.success("sucess", list);
    }

}