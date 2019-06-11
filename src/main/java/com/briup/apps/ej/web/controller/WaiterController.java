package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.service.IWaiterService;
import com.briup.apps.ej.service.Impl.IWaiterServiceImpl;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.WatchService;
import java.util.List;

/**
 * @author zhangbaoguo
 * @create 2019-06-10 13:43
 */
@RestController
@RequestMapping("/Waiter")

public class WaiterController {
    @Autowired
    private IWaiterServiceImpl waiterService;

    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Waiter waiter) {
        List<Waiter> list = waiterService.query(waiter);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("查询所有服务员")
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

    @ApiOperation("保存或更新用户信息")
    @GetMapping("saveOrupdate")
    public Message savaOrUpdate(Waiter waiter) {
        try {
            waiterService.saveOrUpdate(waiter);
            return MessageUtil.success("success", waiter);
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("通过id删除用户信息")
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

    @ApiOperation("插入数据")
    @GetMapping("insert")
    public Message insert(Waiter waiter) {
        try {
            //waiterService.insert(waiter);
            waiterService.saveOrUpdate(waiter);
            return MessageUtil.success("success", waiter);
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }


}
