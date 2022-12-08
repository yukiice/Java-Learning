package com.example.testone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@WebServlet("/time")
public class XhrServlet extends HttpServlet {
    @Override
    protected void   doGet(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String date = dateFormat.format(new Date());
        res.setContentType("text/html;charset=UTF-8");
        res.getWriter().write(date);
        System.out.println(getServletContext().getAttribute("test"));
    }

    @Override
    protected  void  doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
        res.setContentType("text/html;charset=UTF-8");
        res.getWriter().write("<h1>OK</h1>");
    }
}
