package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.VM.OrderVM;
import com.briup.apps.ej.bean.VM.ProductVM;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-11 16:44
 */
public interface ProductExtendMapper {
    public void creOrdLin(Integer num,Long id);//通过产品id穿件orderLie并传入数量
    List<ProductVM> queryBasic( @Param("productId")Long productId);
}
