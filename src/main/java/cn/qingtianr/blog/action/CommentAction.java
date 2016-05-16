package cn.qingtianr.blog.action;

import java.util.ArrayList;

import cn.qingtianr.blog.model.Comment;
import cn.qingtianr.blog.service.CommentService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by jack on 16-5-2.
 */
public class CommentAction extends ActionSupport {

    private int                id;
    private Comment            comment;    // 评论对象
    private CommentService     commentsi;  // 评论逻辑组件
    private ArrayList<Comment> commentlist; // 返回的评论列表

    /**
     * 添加评论功能
     * param comment
     * return success
     */
    public String addComment() {
        commentsi.addComment(comment);
        // 返回原始页面
        return "success";
    }

    /**
     * 后台显示评论功能
     * param
     * return success
     */
    public String showComment() {
        commentlist = commentsi.showComment();
        return "success";
    }

    // 前端页面显示评论,其实这个功能是由showArticle这个action调用的

    // 前端自己删除自己的评论功能？
    public String delPostComment() {
        return null;
    }

    // 后端删除评论功能,并且显示功能
    public String delComment() {
        System.out.println("in delComment()=" + comment.getId());
        commentsi.delComment(comment);
        commentlist = commentsi.showComment();
        return "success";
    }

    // 后台修改评论功能
    // 好像不需要这个功能
    public String modifyComment() {
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

    public ArrayList<Comment> getCommentlist() {
        return commentlist;
    }

    public void setCommentlist(ArrayList<Comment> commentlist) {
        this.commentlist = commentlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
