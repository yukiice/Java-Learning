package com.example.testone;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.io.Resources;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/file")
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/png");
        OutputStream outputStream = resp.getOutputStream();
        InputStream inputStream = Resources.getResourceAsStream("doing.png");
        IOUtils.copy(inputStream, outputStream);
    }
}
