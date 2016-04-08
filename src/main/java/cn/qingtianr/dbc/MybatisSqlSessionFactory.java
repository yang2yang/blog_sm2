package main.java.cn.qingtianr.dbc;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by jack on 16-3-29.
 */
public class MybatisSqlSessionFactory {
    // 配置文件的所在位置和名称
    private static String CONFIG_FILE_LOCATION = "main/resources/mybits.xml";

    // Hibernate用来读取配置文件的类
    private static Reader reader;
    // 用来建立连接的，该类就是连接池，使用单例设计模式
    private static SqlSessionFactory sqlsessionFactory;
    // 备用的配置文件位置
    private static String configFile = CONFIG_FILE_LOCATION;

    private static SqlSession session;

    // 静态块，类加载时最先执行
    static {
        try {
            // 加载配置文件到内存中
            reader = Resources.getResourceAsReader(configFile);
            // 建立连接池以及里面的连接
            sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            System.err.println("%%%% Error Creating SessionFactory %%%%");
            e.printStackTrace();
        }
    }

    /**
     * 取得数据库连接对象
     *
     * @return Session
     * @throws HibernateException
     */
    public static SqlSession getSession() {

        // 如果手头没有连接，则取得一个新的连接
        session = sqlsessionFactory.openSession();
        // 把取得出的连接记录到ThreadLocal中，以便下次使用。
        return session;
    }

    /**
     * 连接关闭的方法
     *
     * @throws HibernateException
     */
    public static void closeSession() {
        if (session != null) {
            System.out.println("session is close");
            session.close();
        }
    }
}
