package cn.qingtianr.blog.dao;

import java.util.ArrayList;

import cn.qingtianr.blog.model.Article;
import cn.qingtianr.blog.model.Comment;

/**
 * Created by jack on 16-5-3.
 */
public interface CommentDao {
    //  添加评论功能
    public int addComment(Comment comment);

    //  后台显示评论功能
    public ArrayList<Comment> showComment();

    //  前端页面显示评论
    public ArrayList<Comment> showPostComment(Article article);

    //  前端自己删除自己的评论功能？
    public String delPostComment();

    //  后端删除评论功能
    public int delComment(Comment comment);

    //  后台修改评论功能
//  好像不需要这个功能
    public String modifyComment();
}
