package main.java.cn.qingtianr.service;

import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.model.ArticleCount;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public interface ArticleService{
//  在数据库中添加一篇文章
    public boolean addArticle(Article article);
//  将数据库中所有的文章都打包成一个列表并返回
    public ArrayList<Article> showArticle();
//  通过一篇文章的标题来获得一篇文章
    public Article getOneArticle(String title);
//  更新一篇文章
    public boolean updateArticle(Article article);
//  删除一篇文章
    public boolean deleteArticle(String title);
//  通过类别返回这个文章中的数量
    public int countArticle(String archive);

    public ArrayList<ArticleCount> countDatetime();

    public ArrayList<Article> showDatetimeArticle(Date datetime);
}
