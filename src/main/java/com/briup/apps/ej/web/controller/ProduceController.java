package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping

public class ProduceController {
    @Autowired
    private IProductService productService;
}
