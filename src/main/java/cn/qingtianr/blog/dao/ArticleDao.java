package cn.qingtianr.blog.dao;

import java.sql.Date;
import java.util.ArrayList;

import cn.qingtianr.blog.model.Article;
import cn.qingtianr.blog.model.ArticleCount;

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
}
