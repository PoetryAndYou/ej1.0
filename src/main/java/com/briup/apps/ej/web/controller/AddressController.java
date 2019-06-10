package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2019-06-10 13:41
 */
@RestController
@RequestMapping

public class AddressController {
    @Autowired
    private IAddressService addressService;
}
