package cn.qingtianr.blog.service.impl;

import java.util.ArrayList;

import cn.qingtianr.blog.dao.CommentDao;
import cn.qingtianr.blog.model.Article;
import cn.qingtianr.blog.model.Comment;
import cn.qingtianr.blog.service.CommentService;

/**
 * Created by jack on 16-5-2.
 */
public class CommentServiceImpl implements CommentService{
    private CommentDao commentdao;
//  在数据库中添加评论
    @Override
    public String addComment(Comment comment) {
        commentdao.addComment(comment);
        return null;
    }

//  后端显示评论功能，将数据库中所有的评论取出来，并按时间排序
    @Override
    public ArrayList<Comment> showComment() {
        ArrayList<Comment> commentlist = commentdao.showComment();
        return commentlist;
    }

//  前端页面显示功能
    @Override
    public ArrayList<Comment> showPostComment(Article article) {
        ArrayList<Comment> commentlist = commentdao.showPostComment(article);
        return commentlist;
    }

    @Override
    public String delPostComment() {
        return null;
    }

    @Override
    public Boolean delComment(Comment comment) {
        boolean flag = false;
        int flag2 = commentdao.delComment(comment);
        if(flag2 > 0){
            flag = true;
        }
        return flag;
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
