package com.example.testone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/test",loadOnStartup = 1)
public class TestServlet extends HttpServlet {
    @Override
    protected  void  doPost(HttpServletRequest req, HttpServletResponse res) throws SecurityException, IOException, ServletException {
        String name = req.getParameter("password");
        Cookie cookie = new Cookie("test","123456");
        res.addCookie(cookie);
        HttpSession session = req.getSession();
        session.setAttribute("user",name);
        req.getRequestDispatcher("/time").forward(req,res);
    }
}
