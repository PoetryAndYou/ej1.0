package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.service.Impl.IWaiterServiceImpl;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.nio.file.WatchService;
import java.util. List;

/**
 * @author zhangbaoguo
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping("/waiter")

public class WaiterController {
    @Autowired
    private IWaiterServiceImpl waiterService;

    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Waiter waiter) {
        List<Waiter> list = waiterService.query(waiter);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("查询所有员工")
    @GetMapping("findAll")
    public Message findAll() {
        List<Waiter> waiter = waiterService.findAll();
        return MessageUtil.success("success", waiter);

    }

    @ApiOperation("通过id查询")
    @GetMapping("findById")
    public Message finByid(
            @ApiParam(value = "主键", required = true)
            @RequestParam(value = "id") long id) {
        Waiter waiter = waiterService.findById(id);
        return MessageUtil.success("success", waiter);
    }

    @ApiOperation("保存或更新员工信息")
    @PostMapping ("saveOrupdate")
    public Message savaOrupdate(Waiter waiter) {
        try {
            waiterService.saveOrupdate(waiter);
            return MessageUtil.message("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("通过id删除员工信息")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam(value = "主键", required = true)
                              @RequestParam("id") long id) {
        try {
            waiterService.deleteById(id);
            return MessageUtil.success("success", waiterService);
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("批量删除员工信息")
    @PostMapping("batchDelete")
    public Message batchDelete(@NotNull(message = "id不能为空") Long[] ids) throws Exception {
        for (Long id: ids
        ) {
            waiterService.batchDelete(ids);
        }
        return MessageUtil.message("成功");
    }
}
