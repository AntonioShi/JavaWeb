package com.example.model;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet("/com.example.model.HelloWorld")
//可以让webServlet链接到写的java文件
public class HelloWorld extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public HelloWorld(){
        super() ;
        System.out.println("创建servlet");
    }

    private String message;

    public void init()throws ServletException{
        message ="Hello world, this message is from servlet!";
        System.out.println("初始化servlet");
    }

    protected void service (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("调用servlet方法");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //设置响应内容类型
        resp.setContentType("text/html");//设置逻辑实现
        PrintWriter out = resp.getWriter();//可以将文档内容发送给客户
        out.println(""+ message +"");
    }

    public void destroy(){
        //撤销
        super.destroy();
    }

}
