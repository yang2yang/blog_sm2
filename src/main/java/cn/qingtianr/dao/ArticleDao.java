package main.java.cn.qingtianr.dao;

import main.java.cn.qingtianr.model.Article;

import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleDao {
    public Boolean addArticle(Article article);
    public ArrayList showArticle();
}
