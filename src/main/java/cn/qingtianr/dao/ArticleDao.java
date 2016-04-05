package main.java.cn.qingtianr.dao;

import main.java.cn.qingtianr.model.Article;

import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleDao {
    public int addArticle(Article article);
    public ArrayList<Article> showArticle();
    public Article getOneArticle(String title);
    public void updateArticle(Article article);
    public void deleteArticle(String title);
}
