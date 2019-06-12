package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Customer;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:26
 */
public interface ICustomerService {
    List<Customer> query(Customer customer);
    List<Customer>  findAll();
    Customer findById(long id);
    void saveOrupdate (Customer customer) throws Exception;

    void deleteById(long id) throws Exception;

    void batchDelete(Long ids[])throws  Exception;


}