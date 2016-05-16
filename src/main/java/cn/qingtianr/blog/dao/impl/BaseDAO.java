package cn.qingtianr.blog.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDAO
{
	
	/** The logger. */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	/** The sql session. */
	@Autowired
	@Qualifier("sqlSessionTemplate")
	protected SqlSessionTemplate sqlSession;
	
	/**
	 * Gets the stament name space.
	 *
	 * @param method the method
	 * @return the stament name space
	 */
	protected String getStamentNameSpace(String method)
	{
		return getClass().getName() + "." + method;
	}
	
	/**
	 * Gets the sql session.
	 *
	 * @return the sql session
	 */
	protected SqlSessionTemplate getSqlSession()
	{
		return sqlSession;
	}
}
