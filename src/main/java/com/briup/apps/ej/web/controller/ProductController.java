package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Product;
import com.briup.apps.ej.bean.VM.ProductVM;
import com.briup.apps.ej.bean.extend.CategoryExtend;
import com.briup.apps.ej.service.IProductService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/findALLPro")
    @ApiOperation("查询所有产品")
    public Message findALLPro() {
        List<Product> list = productService.findALLPro();
        return MessageUtil.
                success("sucess", list);
    }

    @GetMapping("/creOrdLin")
    @ApiOperation("输入产品id和数量产生订单项")
    public Message creOrdLin(Integer num, Long id) {
        productService.creOrdLin(num, id);
        return MessageUtil.message("创建成功");
    }

    @PostMapping("/saveOrupdate")
    @ApiOperation("更新插入product")
    public Message saveOrupdate( Product product) throws Exception {
        productService.saveOrupdate(product);
        return MessageUtil.message("成功");
    }

    @GetMapping("/findById")
    @ApiOperation("查询product")
    public Message findById(Long id) {
        Product product = productService.findById(id);
        return MessageUtil.success("sucess", product);
    }

    @GetMapping("/deleteById")
    @ApiOperation("删除product")
    public Message deleteById( Long id) throws Exception {
        productService.deleteById(id);
        return MessageUtil.message("删除成功");
    }
    //增加批量删除
    @ApiOperation("批量删除")
    @PostMapping("batchDeletion")
    public Message batchDeletion(@NotNull(message = "id不能为空")Long[] ids) throws Exception {

        productService.batchDeletion(ids);
        return MessageUtil.message("删除成功");
    }
    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Product product){
        List<Product> list=productService.query(product);
        return MessageUtil.success("查询成功",list);
    }
    @ApiOperation("通过productId查询该产品的所有评论")
    @GetMapping("queryBasic")
  public Message  queryBasic( Long productId){
      List<ProductVM> list=productService.queryBasic(productId);
      return MessageUtil.success("sucess",list);
    }
}
