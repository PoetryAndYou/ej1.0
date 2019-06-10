package com.briup.apps.ej.bean.extend;

import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.Product;

/**
 * @author rui
 * @create 2019-06-10 20:01
 */
public class CategoryExtend extends Category{
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
