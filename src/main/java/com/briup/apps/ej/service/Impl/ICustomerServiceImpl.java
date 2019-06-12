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
    private CustomerMapper CustomerMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return CustomerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Customer record) {
        return CustomerMapper.insert(record);
    }



    @Override
    public Customer selectByPrimaryKey(Long id) {
        return CustomerMapper.selectByPrimaryKey(id);
    }


    //查询所有顾客信息
    @Override
    public List<Customer> findAllcustomer() {

        return CustomerMapper.selectByExample(new CustomerExample());
    }

    //模糊查询顾客信息，模糊查询通过真实姓名，电话号
    @Override
    public List<Customer> query(Customer customer) {
        CustomerExample customerExample = new CustomerExample();
        if(customer.getRealname()!=null){
            customerExample.createCriteria().andRealnameLike("%"+customer.getRealname()+"%");
        }
        if(customer.getTelephone()!=null){
            customerExample.createCriteria().andTelephoneLike("%"+customer.getTelephone()+"%");
        }
        return CustomerMapper.selectByExample(customerExample);
    }

    //更新顾客信息数据

    @Override
    public int updateByPrimaryKey(Customer record) {
        return CustomerMapper.updateByPrimaryKey(record);
    }
}
