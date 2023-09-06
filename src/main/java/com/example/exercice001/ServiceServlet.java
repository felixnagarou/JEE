package com.example.exercice001;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ServiceServlet", value = "service")
public class ServiceServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println(" server launched successfully");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get request confirmed");
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();

        writer.println("monServlet response");
    }

}
