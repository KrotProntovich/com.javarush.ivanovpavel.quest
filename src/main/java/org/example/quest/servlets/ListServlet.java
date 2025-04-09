package org.example.quest.servlets;

import org.example.quest.entities.Admin;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin = (Admin) req.getSession().getAttribute("admin");
        req.setAttribute("players", admin.getListPlayers().getPlayers());
        req.getRequestDispatcher("views/list.jsp").forward(req, resp);
    }
}
