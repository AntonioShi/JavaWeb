package com.example.model;

import javax.servlet.annotation.WebServlet;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;


@WebServlet("/com.example.model.Computer")

public class Computer {

    public double getResult(String op, double data) {
        double result = -1 ;
        switch (op) {
            case "squareroot":
                result = Math.sqrt(data) ;
                break;
            case "square":
                result = data * data;
                break;
            case "cube":
                result = data * data * data;
                break;
        }
        return result ;
    }
}
