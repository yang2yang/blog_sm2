package test;

/**
 * Created by jack on 16-3-25.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import main.java.cn.qingtianr.model.User;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String resource = "main/resources/mybits.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = ssf.openSession();
        try{
            User user = (User) session.selectOne("selectUser", "hello");
            System.out.println(user.getUsername());
            System.out.println("--------------分隔线---------------");

            List<User> users = session.selectList("selectUsers");
            for(int i=0; i<users.size(); i++) {
                System.out.println(users.get(i).getUsername());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}