package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.bean.ProductExample;
import com.briup.apps.ej.bean.extend.ProductExtend;
import com.briup.apps.ej.dao.ProductMapper;
import com.briup.apps.ej.dao.extend.ProductExtendMapper;
import com.briup.apps.ej.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class IProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;
    @Resource
    private ProductExtendMapper productExtendMapper;

    @Override
    public List<Product> findALLPro() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    @Override
    public void creOrdLin(Integer num, Long id) {
        productExtendMapper.creOrdLin(num, id);
    }

    @Override
    public void saveOrupdate(Product product) throws Exception {
        if (product.getId() == null) {

            productMapper.insert(product);
        } else {
            productMapper.updateByPrimaryKey(product);
        }


    }

    @Override
    public Product findById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        Product product = productMapper.selectByPrimaryKey(id);
        if (product == null) {
            throw new Exception("没有该订单");
        } else {
            productMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void batchDeletion(Long[] ids) throws Exception {
        for (Long id : ids) {
            productMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Product> query(Product product) {
        ProductExample example = new ProductExample();
        if (product.getName() != null) {
            example.createCriteria().andNameLike("%" + product.getName() + "%");
        }
        return productMapper.selectByExample(example);

    }


}
