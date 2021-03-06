package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Comment;
import com.briup.apps.ej.service.ICommentService;
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
@RequestMapping("/comment")
@Validated
public class CommerntController {
    @Autowired
    private ICommentService commentService;
    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Comment comment) {
        List<Comment> list=commentService.query(comment);
        return MessageUtil.success("success",list);
    }
    @ApiOperation("查询所有评论")
    @GetMapping("findAll")
    public Message findAll(){
        List<Comment> list=commentService.findAll();
        return MessageUtil.success("success",list);
    }
    @ApiOperation("通过id查询评论")
    @GetMapping("findById")
    public Message findById(@NotNull @RequestParam("id") long id) {
        Comment comment=commentService.findById(id);
        return MessageUtil.success("success",comment);
    }
    @ApiOperation("保存或更新评论信息")
    @PostMapping ("saveOrupdate")
    public Message saveOrupdate( Comment comment) throws Exception {
            commentService.saveOrupdate(comment);
            return MessageUtil.message("更新成功");

    }
    @ApiOperation("通过id删除评论信息")
    @GetMapping("deleteById")
    public Message deleteById(@NotNull @RequestParam("id")  Long id) throws  Exception{
            commentService.deleteById(id);
            return MessageUtil.message("删除成功");
    }
    //新增批量删除评论信息
    @ApiOperation("批量删除评论信息")
    @PostMapping("batchDelete")
    public Message batchDelete(@NotNull(message = "ids不能为空") Long[] ids) throws Exception{
        commentService.batchDelete(ids);
        return MessageUtil.message("批量删除成功");
    }
}
