package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Category;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 13:37
 */

public interface ICategoryService {
    List<Category> findAll();
    Category findById(long id);
    void saveOrupdate (Category category) throws Exception;
    void deleteById(long id) throws Exception;
}
