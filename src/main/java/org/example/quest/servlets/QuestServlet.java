package org.example.quest.servlets;

import org.apache.commons.lang3.StringUtils;
import org.example.quest.entities.Level;
import org.example.quest.entities.Player;
import org.example.quest.entities.Producer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;


public class QuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("level") == null) {
            Level level = new Level(1);
            session.setAttribute("level", level);
        }
        Level level = (Level) session.getAttribute("level");
        Player player = (Player) session.getAttribute("player");
        String parameterAnswer = req.getParameter("answer");

        Producer producer = new Producer(req.getParameter("qn"));
        HashMap<String, String> stage = producer.startQuest(parameterAnswer, player, level);

        req.setAttribute("prolog", stage.get("prolog") + player.getName());
        req.setAttribute("question", stage.get("question"));
        req.setAttribute("positiveAnswer", stage.get("positiveAnswer"));
        req.setAttribute("negativeAnswer", stage.get("negativeAnswer"));
        req.setAttribute("win",stage.get("win"));
        req.setAttribute("lost", stage.get("lost"));

        if(StringUtils.equals(parameterAnswer, "menu")){
            req.getRequestDispatcher("/menu").forward(req, resp);
        }
        req.getRequestDispatcher("views/quest.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Level nextLevel = (Level) session.getAttribute("level");
        String s = req.getParameter("answer");
        if(StringUtils.equals(s,"pos")) {
            nextLevel.setLevel(nextLevel.getLevel() + 1);
            session.setAttribute("level", nextLevel);
        } else if(StringUtils.equals(s,"res") || StringUtils.equals(s,"menu")) {
            nextLevel.setLevel(1);
        }
        doGet(req, resp);
    }
}
