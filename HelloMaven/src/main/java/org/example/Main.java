package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.TestMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
//        Student student = new Student();
//        student.setName("yukiice");
//        student.setAge(20);
//        System.out.println(student.name);
        SqlSessionFactory session = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        try(SqlSession sqlSession = session.openSession(true)) {
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            System.out.println(mapper.getStudentById(1));
        }
    }
}