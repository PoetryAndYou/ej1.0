package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.service.ICategoryService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 13:42
 */
@RestController
@RequestMapping("/category")

public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @ApiOperation("查询所有类别")
    @GetMapping("findAll")
    public Message findAll(){
        List<Category> list=categoryService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询类别")
    @GetMapping("findById")
    public Message findById(@ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        Category category=categoryService.findById(id);
        return MessageUtil.success("success",category);
    }
    @ApiOperation("保存或更新类别信息")
    @GetMapping("saveOrupdate")
    public Message saveOrupdate(Category category) {
        try {
            categoryService.saveOrupdate(category);
            return MessageUtil.message("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("通过id删除类别信息")
    @GetMapping("deleteById")
    public Message deleteById(
            @ApiParam(value = "主键", required = true) @RequestParam(value = "id") long id) {
        try {
            categoryService.deleteById(id);
            return MessageUtil.message("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}
