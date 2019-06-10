package com.briup.apps.ej.service.Impl;
import com.briup.apps.ej.bean.Category;
import com.briup.apps.ej.bean.Comment;
import com.briup.apps.ej.bean.CommentExample;
import com.briup.apps.ej.dao.CommentMapper;
import com.briup.apps.ej.dao.CustomerMapper;
import com.briup.apps.ej.service.ICommentService;
import com.briup.apps.ej.service.ICustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-10 11:48
 */
@Service
public class ICommentServiceImpl implements ICommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAll() {
        CommentExample example=new CommentExample();
        return commentMapper.selectByExample(example);
    }

    @Override
    public Comment findById(long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrupdate(Comment comment) throws Exception {
        if (comment.getId() == null) {

            commentMapper.insert(comment);
        } else {
            commentMapper.updateByPrimaryKey(comment);
        }
    }

    @Override
    public void deleteById(long id) throws Exception {
        Comment comment = commentMapper.selectByPrimaryKey(id);
        if (comment == null) {
            throw new Exception("要删除的评论不存在");
        } else {
            commentMapper.deleteByPrimaryKey(id);
        }
    }
}
