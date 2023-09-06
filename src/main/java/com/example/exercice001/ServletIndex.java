package com.example.exercice001;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletIndex", value= "/ServletIndex")
public class ServletIndex extends HttpServlet {

    private List<String> index;

    @Override
    public void init() throws ServletException {
        index = new ArrayList<>();
        index.add("Paradigme de l'école de Copenhague");
        index.add("Théorie de l'onde pilote");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("index", index);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
