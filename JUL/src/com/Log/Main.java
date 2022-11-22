package com.Log;

import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Log
public class Main {
//        Logger logger = Logger.getLogger(Main.class.getName());
//        logger.info("halo");

//        Properties properties = new Properties();
//        properties.load(Files.newInputStream(Paths.get("test.properties")));
//        System.out.println(properties);
//
//        System.getProperties().forEach((k,v)-> System.out.println(k+":"+v));

//        配置日志
//        LogManager logManager = LogManager.getLogManager();
//        logManager.readConfiguration(Files.newInputStream(Paths.get("test.properties")));
//        Logger logger = Logger.getLogger(Main.class.getName());
//        logger.log(Level.CONFIG,"我是日志消息");


//        log.info("halo");

        private SqlSessionFactory sqlSessionFactory;
        @Before
        public void before(){
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder()
                        .build(Files.newInputStream(Paths.get("mybatis-config.xml")));
                LogManager manager = LogManager.getLogManager();
                manager.readConfiguration(Files.newInputStream(Paths.get("test.properties")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void test(){
            try(SqlSession sqlSession = sqlSessionFactory.openSession(true)){
                NotesMapper mapper = sqlSession.getMapper(NotesMapper.class);
                log.info(mapper.getBrand().toString());
            }
        }
}
