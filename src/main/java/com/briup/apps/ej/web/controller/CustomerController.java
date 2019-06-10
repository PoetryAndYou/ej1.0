package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2019-06-10 11:51
 */
@RestController
@RequestMapping

public class CustomerController {
    @Autowired
    private ICustomerService customerService;



}
