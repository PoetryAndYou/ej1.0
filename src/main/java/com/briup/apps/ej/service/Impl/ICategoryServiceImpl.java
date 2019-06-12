package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.CategoryExample;
import com.briup.apps.ej.bean.extend.CategoryExtend;
import com.briup.apps.ej.dao.CategoryMapper;
import com.briup.apps.ej.dao.extend.CategoryExtendMapper;
import com.briup.apps.ej.service.ICategoryService;
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
   @Resource
    private CategoryExtendMapper categoryExtendMapper;

    @Override
    public List<Category> query(Category category) {
        CategoryExample example = new CategoryExample();

        if(category.getName()!=null){
            example
                    .createCriteria()
                    .andNameLike("%"+category.getName()+"%");
        }
        if(category.getNum()!=null){
            example
                    .createCriteria()
                    .andNumEqualTo(category.getNum());
        }
        if(category.getParentId()!=null){
            example.createCriteria().andParentIdEqualTo(category.getParentId());
        }

        return categoryMapper.selectByExample(example);
    }

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

    @Override
    public List<CategoryExtend> findAllP(Long id) {

        return categoryExtendMapper.findAllP(id);
    }

    @Override
    public void batchDelete(Long[] ids) throws Exception {
        for(long id :ids){
            categoryMapper.deleteByPrimaryKey(id);
        }
    }
}
