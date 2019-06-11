package com.briup.apps.ej.dao.extend;


import com.briup.apps.ej.bean.extend.CategoryExtend;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 20:51
 */
public interface CategoryExtendMapper {
    List<CategoryExtend>  findAllP(Long id);
}
