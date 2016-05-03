package main.java.cn.qingtianr.model;

import java.sql.Date;

/**
 * Created by jack on 16-3-30.
 */
public class Article {
    private int id;
    private String title;
    private String archive;
    private Date datetime;
    private String content;

    public Article(){

    }

    public Article(String title, String archive, String content,Date datetime) {
        this.title = title;
        this.archive = archive;
        this.content = content;
        this.datetime = datetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
