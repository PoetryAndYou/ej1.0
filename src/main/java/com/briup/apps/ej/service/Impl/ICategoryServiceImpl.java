package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.CategoryExample;
import com.briup.apps.ej.dao.CategoryMapper;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.ICategoryService;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 11:48
 */
@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example =new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public Category findById(long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdate(Category category) throws Exception {
        if (category.getId() == null) {

            categoryMapper.insert(category);
        } else {
            categoryMapper.updateByPrimaryKey(category);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null) {
            throw new Exception("要删除的类别不存在");
        } else {
            categoryMapper.deleteByPrimaryKey(id);
        }
    }
}
