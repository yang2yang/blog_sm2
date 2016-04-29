package main.java.cn.qingtianr.dao;

import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.model.ArticleCount;

import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleDao {
    public Boolean addArticle(Article article);
    public ArrayList<Article> showArticle();
    public Article getOneArticle(String title);
    public Boolean updateArticle(Article article);
    public Boolean deleteArticle(String title);
    public int countArticle(String archive);
    public ArrayList<ArticleCount> countDatetime();
}
