package com.Caching;

import org.apache.ibatis.session.SqlSession;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
//            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//            List<Student> students1;
//            List<Student> students2;
//
//            try (SqlSession sqlSession1  = MybatisUtil.getSession(true)){
//                TestMapper mapper1 = sqlSession1.getMapper(TestMapper.class);
//                students1 = mapper1.selectStudentById(1);
//            }
//
//            students2 = mapper.selectStudentById(1);
//
//            System.out.println(students1 == students2);

//            验证缓存后的结果
//            List<Student> student;
//            try (SqlSession sqlSession1 = MybatisUtil.getSession(true)){
//                TestMapper testMapper = sqlSession1.getMapper(TestMapper.class);
//                student = testMapper.selectStudentById(1);
//            }
//
//            try (SqlSession sqlSession2 = MybatisUtil.getSession(true)){
//                TestMapper testMapper2 = sqlSession2.getMapper(TestMapper.class);
//                List<Student> student2 = testMapper2.selectStudentById(1);
//                System.out.println(student2 == student);
//            }
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            while (true){
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(mapper.selectStudentById(1));
            }
        }
    }

}
