package main.java.cn.qingtianr.model;

/**
 * Created by jack on 16-3-30.
 */
public class Article {
    private String title;
    private String archive;
    private String content;

    public Article(){

    }

    public Article(String title, String archive, String content) {
        this.title = title;
        this.archive = archive;
        this.content = content;
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
}
