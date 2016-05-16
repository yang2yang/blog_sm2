/**
 * Project Name:blog_sm2
 * File Name:ArticleDaoImpl.java
 * Package Name:cn.qingtianr.blog.dao.impl
 * Date:2016年5月16日下午3:00:07
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
*/
/**
 * Project Name:blog_sm2
 * File Name:ArticleDaoImpl.java
 * Package Name:cn.qingtianr.blog.dao.impl
 * Date:2016年5月16日下午3:00:07
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
 */

package cn.qingtianr.blog.dao.impl;

import java.sql.Date;
import java.util.ArrayList;

import cn.qingtianr.blog.dao.ArticleDao;
import cn.qingtianr.blog.model.Article;
import cn.qingtianr.blog.model.ArticleCount;


/**
 * ClassName:ArticleDaoImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年5月16日 下午3:00:07 <br/>
 * @author   ZFZ
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class ArticleDaoImpl extends BaseDAO implements ArticleDao {

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#addArticle(cn.qingtianr.blog.model.Article)
     */
    @Override
    public int addArticle(Article article) {
        try
        {
            return getSqlSession().insert(getStamentNameSpace("addArticle"), article);
        }
        catch (Exception e)
        {
            logger.error("addArticle data happen [DB] error!", e);
        }
        return 0;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#showArticle()
     */
    @Override
    public ArrayList<Article> showArticle() {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#getOneArticle(java.lang.String)
     */
    @Override
    public Article getOneArticle(String title) {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#updateArticle(cn.qingtianr.blog.model.Article)
     */
    @Override
    public Boolean updateArticle(Article article) {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#deleteArticle(java.lang.String)
     */
    @Override
    public Boolean deleteArticle(String title) {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#countArticle(java.lang.String)
     */
    @Override
    public int countArticle(String archive) {

        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#countDatetime()
     */
    @Override
    public ArrayList<ArticleCount> countDatetime() {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.ArticleDao#showDatetimeArticle(java.sql.Date)
     */
    @Override
    public ArrayList<Article> showDatetimeArticle(Date datetime) {

        // TODO Auto-generated method stub
        return null;
    }

}

