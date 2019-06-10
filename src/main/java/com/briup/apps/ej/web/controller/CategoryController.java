package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui
 * @create 2019-06-10 13:42
 */
@RestController
@RequestMapping

public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
}
