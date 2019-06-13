package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.OrderLineExtend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-13 9:24
 */
public interface OrderLineExtendMapper {
    List<OrderLineExtend> selectById(Long id);
}
