package com.example.jsp;

import org.tinygroup.template.TemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    TemplateEngine engine;
    @Override
    public  void init() throws  SecurityException{

    }
}
