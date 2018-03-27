package com.example.web;

import com.example.model.Computer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Myservlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //设置响应内容类型
        String num = request.getParameter("data") ;//接受数据
        double number = Double.valueOf(num) ;//调整数据类型
        String op = request.getParameter("operation") ;//运算符
        Computer computer = new Computer() ;
        double result = computer.getResult(op, number) ;

        request.setAttribute("result", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
