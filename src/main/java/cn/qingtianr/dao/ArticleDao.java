package main.java.cn.qingtianr.dao;

import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.model.ArticleCount;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleDao {
    public int addArticle(Article article);
    public ArrayList<Article> showArticle();
    public Article getOneArticle(String title);
    public Boolean updateArticle(Article article);
    public Boolean deleteArticle(String title);
    public int countArticle(String archive);
    public ArrayList<ArticleCount> countDatetime();
    public ArrayList<Article> showDatetimeArticle(Date datetime);
    public ArrayList<Article> showPageArticle(int index,int number);
}
