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
    public void saveOrUpdate(Product product) throws Exception {
        ProductExtend extend=new ProductExtend();
        if(product.getId()==null){

            productMapper.insert(product);
        }else{
            productMapper.updateByPrimaryKey(extend);
        }


    }

    @Override
    public Product findById(Long id)  {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        Product product=productMapper.selectByPrimaryKey(id);
        if(product==null){
            throw new Exception("没有该订单");
        }else{
            productMapper.deleteByPrimaryKey(id);
        }
    }


}
