package main.java.cn.qingtianr.model;

import java.sql.Date;

/**
 * Created by jack on 16-4-29.
 */
public class ArticleCount {
    private Date datetime;
    private int count;

    public ArticleCount(){

    }
    public ArticleCount(Date datetime,int count){
        this.datetime = datetime;
        this.count = count;
    }


    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
