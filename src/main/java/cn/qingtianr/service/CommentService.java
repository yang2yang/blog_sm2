package main.java.cn.qingtianr.service;

import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.model.Comment;

import java.util.ArrayList;

/**
 * Created by jack on 16-5-2.
 */
public interface CommentService {
    //  添加评论功能
    public String addComment(Comment comment);

    //  后台显示评论功能
    public ArrayList<Comment> showComment();

    //  前端页面显示评论
    public ArrayList<Comment> showPostComment(Article article);

    //  前端页面显示功能

    //  前端自己删除自己的评论功能？
    public String delPostComment();

    //  后端删除评论功能
    public Boolean delComment(Comment comment);

    //  后台修改评论功能
//  好像不需要这个功能
    public String modifyComment();
}
