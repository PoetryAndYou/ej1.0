package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.extend.CustomerExtend;

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

    List<CustomerExtend> findMyAddress(Long id);    //查找用户自己的地址
}