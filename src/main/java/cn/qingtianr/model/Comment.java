package main.java.cn.qingtianr.model;

/**
 * Created by jack on 16-5-2.
 */
public class Comment {
//  post是标记文章的外键
    private int post;
    private String name;
    private String comment;

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
}
