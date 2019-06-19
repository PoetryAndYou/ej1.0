package com.briup.apps.ej.bean.VM;

/**
 * @author rui
 * @create 2019-06-19 10:37
 */
public class ProductVM {
    private String content;
    private Long commentTime;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Long commentTime) {
        this.commentTime = commentTime;
    }
}
