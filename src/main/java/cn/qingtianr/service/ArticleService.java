package main.java.cn.qingtianr.service;

import main.java.cn.qingtianr.model.Article;

import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleService{
    public boolean addArticle(Article article);

    public ArrayList<Article> showArticle();

    public Article getOneArticle(String title);

    public boolean updateArticle(Article article);
}
