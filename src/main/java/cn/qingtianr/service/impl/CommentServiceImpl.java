package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.CommentDao;
import main.java.cn.qingtianr.model.Comment;
import main.java.cn.qingtianr.service.CommentService;

/**
 * Created by jack on 16-5-2.
 */
public class CommentServiceImpl implements CommentService{
    private CommentDao commentdao;
    @Override
    public String addComment(Comment comment) {
        commentdao.addComment(comment);
        return null;
    }

    @Override
    public String showComment() {
        return null;
    }

    @Override
    public String showPostComment() {
        return null;
    }

    @Override
    public String delPostComment() {
        return null;
    }

    @Override
    public String delComment() {
        return null;
    }

    @Override
    public String modifyComment() {
        return null;
    }

    public CommentDao getCommentdao() {
        return commentdao;
    }

    public void setCommentdao(CommentDao commentdao) {
        this.commentdao = commentdao;
    }
}
