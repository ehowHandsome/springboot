package com.springboot.base;

import com.springboot.Entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class BaseApplicationTests {

    @Test
    void contextLoads() throws IOException {
        InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=sqlSessionFactory.openSession();
        Person person =session.selectOne("test.FindPersonById", 2);
        System.out.println(person);
        session.close();
        in.close();



    }

}
