package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.bean.ProductExample;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.dao.ProductMapper;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findALLPro() {
        ProductExample example=new ProductExample();
        return productMapper.selectByExample(example);
    }
}
