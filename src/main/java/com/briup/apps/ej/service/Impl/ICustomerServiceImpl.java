package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.bean.CustomerExample;
import com.briup.apps.ej.bean.extend.CustomerExtend;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.dao.extend.CustomerExtendMapper;
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
     @Resource
     private CustomerExtendMapper customerExtendMapper;

    @Override
    public List<Customer> query(Customer customer) {
        CustomerExample example = new CustomerExample();

        if(customer.getTelephone()!=null){
            example
                    .createCriteria()
                    .andTelephoneLike("%"+customer.getTelephone()+"%");
        }
        if(customer.getPassword()!=null){
            example
                    .createCriteria()
                    .andPasswordLike("%"+customer.getPassword()+"%");
        }
        if(customer.getRealname()!=null){
            example.createCriteria().andRealnameLike(customer.getRealname());
        }

        return customerMapper.selectByExample(example);
    }

    @Override
    public List<Customer> findAll() {
        CustomerExample example = new CustomerExample();
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer findById(long id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdate(Customer customer) throws Exception {
        if (customer.getId() == null) {
            customer.setStatus("正常");
            customerMapper.insert(customer);
        } else {
            customerMapper.updateByPrimaryKey(customer);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Customer customer = customerMapper.selectByPrimaryKey(id);
        if (customer == null) {
            throw new Exception("要删除的地址不存在");
        } else {
            customerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void batchDelete(Long[] ids) throws Exception {
        for(long id :ids){
            customerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<CustomerExtend> findMyAddress(Long id) {
        return customerExtendMapper.findMyAddress(id);
    }


}
