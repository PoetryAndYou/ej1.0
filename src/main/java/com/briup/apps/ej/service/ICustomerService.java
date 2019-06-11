package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:26
 */
public interface ICustomerService {
    List<Customer> findAll();
}
