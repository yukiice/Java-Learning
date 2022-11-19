package com.Dynamic;

import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(mapper.getProductList());
        }
    }
}
