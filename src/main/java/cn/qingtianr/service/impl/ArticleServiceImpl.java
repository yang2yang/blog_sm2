package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.ArticleDao;
import main.java.cn.qingtianr.dbc.MybatisSqlSessionFactory;
import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.service.ArticleService;

import java.util.ArrayList;

/**
 * Created by jack on 16-3-30.
 */
public class ArticleServiceImpl implements ArticleService{
    private ArticleDao articledao;

    @Override
    public boolean addArticle(Article article) {
        try{
            articledao.addArticle(article);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return true;
    }

    @Override
    public ArrayList<Article> showArticle() {
        ArrayList<Article> articlelist = new ArrayList();
         try{
            articlelist = articledao.showArticle();
             System.out.println("article[0].title = " + articlelist.get(0).getTitle());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return articlelist;
    }

    @Override
    public Article getOneArticle(String title) {
        Article article = new Article();
        try{
            System.out.println("It is in getOneArticle!!!");
            article = articledao.getOneArticle(title);
            System.out.println("It is in getOneArtcile hello article.title = " + article.getTitle());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return article;
    }

    @Override
    public boolean updateArticle(Article article) {
        try{
            System.out.println(article.getTitle());
            System.out.println(article.getArchive());
            System.out.println(article.getContent());
            articledao.updateArticle(article);
            System.out.println("hello It is in updateArticle");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return true;
    }

    @Override
    public boolean deleteArticle(String title) {
        try{
            System.out.println(title);
            int s = 9;
            articledao.deleteArticle(title);
            System.out.println("hello It is in deleteArticle");
            System.out.println("s="+s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return true;

    }

    @Override
    public int countArticle(String archive) {
        int count;
         try{
            System.out.println(archive);
            count = articledao.countArticle(archive);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return count;
   }

    public void setArticledao(ArticleDao articledao) {
        this.articledao = articledao;
    }

    public ArticleDao getArticledao() {
        return articledao;
    }
}
