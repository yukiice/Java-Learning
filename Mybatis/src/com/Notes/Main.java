package com.Notes;

import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            NotesMapper mapper = sqlSession.getMapper(NotesMapper.class);
//            mapper.addStudent(new Student().setName("花花").setAge(10));
//            System.out.println(mapper.getStudent());
//            System.out.println(mapper.getProduct());
//            System.out.println(mapper.getBrand());

//            System.out.println(mapper.getListTwo());

            System.out.println(mapper.selectListTwo("华为",2000));
        }
    }
}
