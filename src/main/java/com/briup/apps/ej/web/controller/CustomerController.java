package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.extend.CustomerExtend;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:51
 */
@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    //模糊查询
    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Customer customer) {
        List<Customer> list = customerService.query(customer);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("查询所有客户")
    @GetMapping("findAll")
    public Message findAll() {
        List<Customer> list = customerService.findAll();
        return MessageUtil.success("success", list);
    }
//通过id查询客户
    @ApiOperation("通过id查询客户")
    @GetMapping("findById")
    public Message findById(@ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        Customer customer = customerService.findById(id);
        return MessageUtil.success("success", customer);
    }
//保存货更新客户信息
    @ApiOperation("保存或更新客户信息")
    @PostMapping("saveOrupdate")
    public Message saveOrupdate(@Valid @ModelAttribute Customer customer) throws Exception {
            customerService.saveOrupdate(customer);
            return MessageUtil.message("更新成功");

    }

    @ApiOperation("通过id删除客户信息")
    @GetMapping("deleteById")
    public Message deleteById(@NotNull @RequestParam("id") long id) throws Exception {
            customerService.deleteById(id);
            return MessageUtil.message("删除成功");

    }
//增加了批量删除客户信息
    @ApiOperation("批量删除客户信息")
    @PostMapping("batchDelete")
    public Message batchDelete(@NotNull(message = "id不能为空") Long[] ids) throws Exception {
        for (Long id : ids)
            customerService.batchDelete(ids);
        return MessageUtil.message("成功");
    }
    //查询用户的地址信息
    @ApiOperation("查询用户的地址信息")
    @GetMapping("findMyAddress")
    public Message findMyAddress(Long id) {
        List<CustomerExtend> list = customerService.findMyAddress(id);
        return MessageUtil.success("success", list);
    }
}
