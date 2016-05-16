package cn.qingtianr.blog.model;


/**
 * Created by jack on 16-4-29.
 */
public class ArticleCount {
    private String datetime;
    private int count;

    public ArticleCount(){

    }
    public ArticleCount(String datetime,int count){
        this.datetime = datetime;
        this.count = count;
    }


    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
