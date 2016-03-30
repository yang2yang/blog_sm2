package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.ArticleDao;
import main.java.cn.qingtianr.dbc.MybatisSqlSessionFactory;
import main.java.cn.qingtianr.model.Article;
import main.java.cn.qingtianr.service.ArticleService;

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
}
