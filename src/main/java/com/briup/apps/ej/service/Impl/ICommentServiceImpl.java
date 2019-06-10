package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.dao.CommentMapper;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.ICommentService;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rui
 * @create 2019-06-10 11:48
 */
@Service
public class ICommentServiceImpl implements ICommentService {
    @Resource
    private CommentMapper commentMapper;

}
