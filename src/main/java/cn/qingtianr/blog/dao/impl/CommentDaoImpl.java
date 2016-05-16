/**
 * Project Name:blog_sm2
 * File Name:CommentDaoImpl.java
 * Package Name:cn.qingtianr.blog.dao.impl
 * Date:2016年5月16日下午3:00:23
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
*/
/**
 * Project Name:blog_sm2
 * File Name:CommentDaoImpl.java
 * Package Name:cn.qingtianr.blog.dao.impl
 * Date:2016年5月16日下午3:00:23
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
 */

package cn.qingtianr.blog.dao.impl;

import java.util.ArrayList;

import cn.qingtianr.blog.dao.CommentDao;
import cn.qingtianr.blog.model.Article;
import cn.qingtianr.blog.model.Comment;


/**
 * ClassName:CommentDaoImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年5月16日 下午3:00:23 <br/>
 * @author   ZFZ
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CommentDaoImpl extends BaseDAO implements CommentDao {

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#addComment(cn.qingtianr.blog.model.Comment)
     */
    @Override
    public int addComment(Comment comment) {

        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#showComment()
     */
    @Override
    public ArrayList<Comment> showComment() {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#showPostComment(cn.qingtianr.blog.model.Article)
     */
    @Override
    public ArrayList<Comment> showPostComment(Article article) {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#delPostComment()
     */
    @Override
    public String delPostComment() {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#delComment(cn.qingtianr.blog.model.Comment)
     */
    @Override
    public int delComment(Comment comment) {

        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * @see cn.qingtianr.blog.dao.CommentDao#modifyComment()
     */
    @Override
    public String modifyComment() {

        // TODO Auto-generated method stub
        return null;
    }

}

