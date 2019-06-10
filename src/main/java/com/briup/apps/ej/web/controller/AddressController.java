package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:41
 */
@RestController
@RequestMapping("/Address")
public class AddressController {
    @Autowired
    private IAddressService addressService;
    @GetMapping("/selectAddress")
    public Message selectAddress() {
        List<Address> list=addressService.selectAddress();
        return MessageUtil.message("sucess",list);
    }


}
