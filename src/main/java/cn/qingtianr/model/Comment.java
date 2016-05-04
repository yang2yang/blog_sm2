package main.java.cn.qingtianr.model;

import java.sql.Date;

/**
 * Created by jack on 16-5-2.
 */
public class Comment {

//  id是评论的主键
    private int id;
//  post是标记文章的外键
    private int post;
    private String name;
    private String comment;
    private Date datetime;

    public Comment(){

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
