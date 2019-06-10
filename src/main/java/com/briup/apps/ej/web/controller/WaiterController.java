package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.service.IWaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping

public class WaiterController {
    @Autowired
    private IWaiterService waiterService;

}
