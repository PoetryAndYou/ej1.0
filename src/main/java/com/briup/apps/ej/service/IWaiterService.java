package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Waiter;
import java.util.List;

/**
 * @author zhangaboguo
 * @create 2019-06-10 13:39
 */
public interface IWaiterService {
    List<Waiter> query(Waiter waiter);
    List<Waiter> findAll();

    Waiter findById (long id);
    void saveOrUpdate (Waiter waiter) throws Exception;
    void deleteById (long id) throws Exception;
    void insert(Waiter waiter);
}
