package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.CustomerExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:26
 */
public interface ICustomerService {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Long id);


    int updateByPrimaryKey(Customer record);

    List <Customer> query(Customer customer);

    List<Customer> findAllcustomer();
}