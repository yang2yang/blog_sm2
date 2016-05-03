package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.ArticleDao;
import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.model.ArticleCount;
import main.java.cn.qingtianr.service.ArticleService;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public class ArticleServiceImpl implements ArticleService{
    private ArticleDao articledao;

    @Override
    public boolean addArticle(Article article) {
       articledao.addArticle(article);
       return true;
    }

    @Override
    public ArrayList<Article> showArticle() {
       ArrayList<Article> articlelist = new ArrayList();
       articlelist = articledao.showArticle();
       System.out.println("article[0].title = " + articlelist.get(0).getDatetime());
       return articlelist;
    }

    @Override
    public Article getOneArticle(String title) {
        System.out.println("It is in getOneArticle!!!");
        Article article = article = articledao.getOneArticle(title);
        System.out.println("It is in getOneArtcile hello article.title = " + article.getId());
        return article;
    }

    @Override
    public boolean updateArticle(Article article) {
        System.out.println(article.getTitle());
        System.out.println(article.getArchive());
        System.out.println(article.getContent());
        articledao.updateArticle(article);
        System.out.println("hello It is in updateArticle");
        return true;
    }

    @Override
    public boolean deleteArticle(String title) {
        System.out.println(title);
        int s = 9;
        articledao.deleteArticle(title);
        System.out.println("hello It is in deleteArticle");
        System.out.println("s="+s);
        return true;

    }

    @Override
    public int countArticle(String archive) {
        int count;
        System.out.println(archive);
        count = articledao.countArticle(archive);

        return count;
   }

    @Override
    public ArrayList<ArticleCount> countDatetime() {
        ArrayList<ArticleCount> articlecount = articledao.countDatetime();
        System.out.println("Impl-countDatetime:"+articlecount.get(0).getDatetime());
        return articlecount;
    }

    @Override
    public ArrayList<Article> showDatetimeArticle(Date datetime) {
        ArrayList<Article> articlelist = new ArrayList();
        articlelist = articledao.showDatetimeArticle(datetime);
        return articlelist;
    }

    public void setArticledao(ArticleDao articledao) {
        this.articledao = articledao;
    }

    public ArticleDao getArticledao() {
        return articledao;
    }
}
