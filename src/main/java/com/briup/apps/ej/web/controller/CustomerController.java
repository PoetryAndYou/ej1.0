package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:51
 */
@RestController
@RequestMapping("customer")

public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @ApiOperation("查询所有顾客信息")
    @GetMapping("findAllCustomer")
    public Message findAllCustomer(){
        List<Customer> list = customerService.findAllcustomer();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("通过主键查询")
    @GetMapping("selectById")
    public Message selectById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id")long id){
        Customer customer=customerService.selectByPrimaryKey(id);
        return MessageUtil.success("success",customer);
    }
    @ApiOperation("通过id删除信息")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam(value = "主键",required = true) @RequestParam("id") Long id){
        try {
            customerService.deleteByPrimaryKey(id);
            return MessageUtil.message("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("添加顾客信息")
    @GetMapping("insert")
    public Message insert(Customer record){

        int insert=customerService.insert(record);
        return MessageUtil.success("success",insert);
    }

    @ApiOperation("更新顾客信息")
    @GetMapping("update")
    public Message updateByExampleSelective(Customer record){

        int updateByExampleSelective=customerService.insert(record);
        return MessageUtil.success("success",updateByExampleSelective);
    }

}