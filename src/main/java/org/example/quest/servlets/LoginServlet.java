package org.example.quest.servlets;

import org.example.quest.entities.Admin;
import org.example.quest.entities.Player;
import org.example.quest.model.ListPlayers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        Admin admin = new Admin(name);
        Player player = admin.getPlayerAndAddList();
        req.getSession().setAttribute("player", player);
        req.getSession().setAttribute("admin", admin);
        req.getRequestDispatcher("/menu").forward(req, resp);
    }
}
