package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.service.IAddressService;
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
 * @author gujunqi
 * @create 2019-06-10 13:41
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;
    @ApiOperation("查询所有地址")
    @GetMapping("findAll")
    public Message findAll(){
        List<Address> list=addressService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询地址")
    @GetMapping("findById")
    public Message findById(@ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        Address address=addressService.findById(id);
        return MessageUtil.success("success",address);
    }
    @ApiOperation("保存或更新地址信息")
    @GetMapping("saveOrupdate")
    public Message saveOrupdate(Address address) {
        try {
            addressService.saveOrupdate(address);
            return MessageUtil.message("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("通过id删除地址信息")
    @GetMapping("deleteById")
    public Message deleteById(
            @ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        try {
            addressService.deleteById(id);
            return MessageUtil.message("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}

