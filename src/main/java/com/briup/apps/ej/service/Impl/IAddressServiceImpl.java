package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.dao.AddressMapper;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IAddressServiceImpl implements IAddressService {
    @Resource
    private AddressMapper addressMapper;

}
