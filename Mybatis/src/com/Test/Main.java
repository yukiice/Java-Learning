package com.Test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            System.out.println(mapper.selectStudentById(4));
//            System.out.println(mapper.addStudent(new Student().setName("yukiice").setAge(900)));

            System.out.println(mapper.deleteStudent(4));
        }
    }

}
