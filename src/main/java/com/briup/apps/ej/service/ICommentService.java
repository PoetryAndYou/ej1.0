package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.Comment;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 13:38
 */
public interface ICommentService {
    List<Comment> findAll();
    Comment findById(long id);
    void saveOrupdate (Comment comment) throws Exception;
    void deleteById(long id) throws Exception;
}
