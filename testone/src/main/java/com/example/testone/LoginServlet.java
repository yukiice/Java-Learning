package com.example.testone;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.testone.Mapper.ServletMapper;
import com.example.testone.Sql.SqlUtil;
import com.example.testone.entity.Student;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@Log
@WebServlet(value = "/login",loadOnStartup = 1,initParams = {
        @WebInitParam(name = "test",value = "我是初始化参数")
})
public class LoginServlet extends HttpServlet {
    SqlSessionFactory factory;
    @SneakyThrows
    @Override
    public void init() throws ServletException {
        System.out.println(getInitParameter("test"));
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
    }
    @Override
    protected  void  doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
        req.getParameterMap().forEach((k, v) -> {
            System.out.println(k + ": " + Arrays.toString(v));
        });
        try (SqlSession sqlSession = factory.openSession(true)){
            ServletMapper mapper = sqlSession.getMapper(ServletMapper.class);
            List<Student> students = mapper.getAllStudent();
            ServletContext context = getServletContext();
////            读取index.html
//            System.out.println(IOUtils.toString(context.getResourceAsStream("index.html"),StandardCharsets.UTF_8));
////            读取mybatis配置文件
//            System.out.println(IOUtils.resourceToString("/mybatis-config.xml",StandardCharsets.UTF_8));
//            req.getRequestDispatcher("/time").forward(req,res);
        }
    }
}
