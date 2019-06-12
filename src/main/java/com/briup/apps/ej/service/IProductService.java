package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.bean.extend.CategoryExtend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:39
 */
public interface IProductService {
    List<Product> findALLPro();
    public void creOrdLin(Integer num,Long id);

    void saveOrUpdate(Product product)throws Exception;
 }
