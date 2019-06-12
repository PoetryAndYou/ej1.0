package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.CustomerExample;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class ICustomerServiceImpl  implements ICustomerService {
    @Resource
    private CustomerMapper customerMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }

    @Override
    public List<Customer> query(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> findAllcustomer() {
        return null;
    }
}
