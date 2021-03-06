package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Waiter;
import com.briup.apps.ej.bean.WaiterExample;

import com.briup.apps.ej.dao.WaiterMapper;
import com.briup.apps.ej.service.IWaiterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangbaoguo
 * @create 2019-06-10 11:48
 */
@Service
public class IWaiterServiceImpl implements IWaiterService {
    @Resource
    private WaiterMapper waiterMapper;
//模糊查询
    @Override
    public List<Waiter> query(Waiter waiter) {
        WaiterExample example = new WaiterExample();
        if (waiter.getRealname() != null) {
           example.createCriteria()
                    .andRealnameLike("%" + waiter.getRealname() + "%");
        }
        if (waiter.getTelephone() != null) {
            example.createCriteria()
                    .andTelephoneLike("%" + waiter.getTelephone() + "%");
        }
        if (waiter.getIdcard() != null) {
            example.createCriteria()
                    .andIdcardLike("%" + waiter.getIdcard() + "%");
        }
        return waiterMapper.selectByExample(example);
    }

//查询所有的员工
    @Override
    public List<Waiter> findAll() {
        WaiterExample waiterexample = new WaiterExample();
        return waiterMapper.selectByExample(waiterexample);
    }

    @Override
    public Waiter findById(long id) {
        // 调用mapper层代码完成查询操作
        return waiterMapper.selectByPrimaryKey(id);
    }
//保存或更新信息
    @Override
    public void saveOrupdate(Waiter waiter) throws Exception {
        if (waiter.getId() == null) {
            // 初始化属性
            waiter.setStatus("正常");
            waiterMapper.insert(waiter);
        } else {
            waiterMapper.updateByPrimaryKey(waiter);
        }
    }
//通过ID删除员工
    @Override
    public void deleteById(long id) throws Exception {
        Waiter waiter = waiterMapper.selectByPrimaryKey(id);
        if (waiter == null) {
            throw new Exception("要删除的用户不存在");
        } else {
            waiterMapper.deleteByPrimaryKey(id);
        }
    }
//批量删除员工
    @Override
    public void batchDelete(Long[] ids) throws Exception {
        for(long id :ids){
            waiterMapper.deleteByPrimaryKey(id);
        }
    }
}