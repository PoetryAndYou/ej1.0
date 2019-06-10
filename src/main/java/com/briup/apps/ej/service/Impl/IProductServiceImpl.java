package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.dao.ProductMapper;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;

}
