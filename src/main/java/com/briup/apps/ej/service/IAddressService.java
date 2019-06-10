package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:36
 */
public interface IAddressService {

    List<Address>  findAll();
}
