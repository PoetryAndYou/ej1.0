package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.extend.CategoryExtend;
import com.briup.apps.ej.service.ICategoryService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 13:42
 */
@RestController
@RequestMapping("/category")
@Validated
public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Category category) {
        List<Category> list=categoryService.query(category);
        return MessageUtil.success("success",list);
    }
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
    @PostMapping("saveOrupdate")
    public Message saveOrupdate( Category category) throws Exception{
            categoryService.saveOrupdate(category);
            return MessageUtil.message("更新成功");
    }
    @ApiOperation("通过id删除类别信息")
    @GetMapping("deleteById")
    public Message deleteById(@NotNull @RequestParam("id") Long id) throws Exception {
            categoryService.deleteById(id);
            return MessageUtil.message("删除成功");
    }
    @ApiOperation("通过id查询商品")
    @GetMapping("findAllP")
    public Message findAllP(Long id) {
        List<CategoryExtend> list=categoryService.findAllP(id);
        return MessageUtil.success("sucess",list);

    }
    @ApiOperation("批量删除类别信息")
    @PostMapping("batchDelete")
    public Message batchDelete(@NotNull(message = "ids不能为空") Long[] ids) throws Exception{
        categoryService.batchDelete(ids);
        return MessageUtil.message("批量删除成功");
    }
}
