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
    @Override
    public boolean addArticle(Article article) {
        try{
            MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).addArticle(article);
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
            articlelist = MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).showArticle();
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
            article = MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).getOneArticle(title);
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
            MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).updateArticle(article);
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
            MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).deleteArticle(title);
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
            count = MybatisSqlSessionFactory.getSession().getMapper(ArticleDao.class).countArticle(archive);
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
}
