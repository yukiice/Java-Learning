package com.Complicated;

import com.Test.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper.selectProduct());
        }
    }
}
