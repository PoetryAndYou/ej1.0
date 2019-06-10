package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.OrderLine;

/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderLineService {
    OrderLine findOrder(Long id);
}
