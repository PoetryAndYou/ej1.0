package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.CustomerExtend;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-13-8:20
 */
public interface CustomerExtendMapper {
  List<CustomerExtend> findMyAddress(Long id) ;
}
