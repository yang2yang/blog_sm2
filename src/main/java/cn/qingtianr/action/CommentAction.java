package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.model.Comment;
import main.java.cn.qingtianr.service.CommentService;

/**
 * Created by jack on 16-5-2.
 */
public class CommentAction extends ActionSupport{
    private Comment comment;
    private CommentService commentsi;
//  添加评论功能
    public String addComment(){
        commentsi.addComment(comment);
//      返回原始页面
        return "success";
    }

//  后台显示评论功能
    public String showComment() {
        return "yes";
    }
//  前端页面显示评论,其实这个功能是由showArticle这个action调用的

//  前端自己删除自己的评论功能？
    public String delPostComment(){
        return null;
    }
//  后端删除评论功能
    public String delComment(){
        return null;
    }
//  后台修改评论功能
//  好像不需要这个功能
    public String modifyComment(){
        return null;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public CommentService getCommentsi() {
        return commentsi;
    }

    public void setCommentsi(CommentService commentsi) {
        this.commentsi = commentsi;
    }
}
