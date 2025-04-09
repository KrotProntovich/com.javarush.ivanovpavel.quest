<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="org.example.quest.entities.Level" %>
<%@ page import="org.example.quest.entities.Player" %><%--
  Created by IntelliJ IDEA.
  User: kpbl
  Date: 08.04.2025
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quest One</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>
<div class="w3-container w3-blue-gray w3-opacity w3-center">
    <h1>Quests</h1>
</div>
<%
    Level level = (Level) request.getSession().getAttribute("level");
    if (level.getLevel() == 1) {
%>
<div class="w3-card-4">
    <div class="w3-container w3-center w3-green">
        <h5>
            <%
                out.println(request.getAttribute("prolog"));
            %>
        </h5>
    </div>
</div>
<%
    }
%>

<div>
    <div class="w3-center w3-light-grey">
        <%
            String question = (String) request.getAttribute("question");
            String answerWin = (String) request.getAttribute("win");
            String answerLost = (String) request.getAttribute("lost");
            if (!StringUtils.isEmpty(question)) {
                out.println(question);
            } else if (!StringUtils.isEmpty(answerWin)) {
                out.println(answerWin);
            } else {
                out.println(answerLost);
            }
        %>


        <form method="post" class="w3-section w3-light-grey w3-padding">
            <%
                String positiveAnswer = (String) request.getAttribute("positiveAnswer");
                if (!StringUtils.isEmpty(positiveAnswer)) {
            %>
            <button type="submit" name="answer" value="pos" class="w3-btn w3-green w3-round-large w3-margin-bottom">
                <%
                    out.print(positiveAnswer);
                %>
            </button>
            <%
                }
            %>

            <%
                String negativeAnswer = (String) request.getAttribute("negativeAnswer");
                if (!StringUtils.isEmpty(negativeAnswer)) {
            %>
            <button type="submit" name="answer" value="neg" class="w3-btn w3-green w3-round-large w3-margin-bottom">
                <%
                    out.println(negativeAnswer);
                %>
            </button>
            <%
                }
            %>

            <%
                if (StringUtils.isEmpty(question)) {
            %>
            <button type="submit" name="answer" value="res" class="w3-btn w3-green w3-round-large w3-margin-bottom">
                Начать сначала
            </button>
            <button type="submit" name="answer" value="menu" class="w3-btn w3-green w3-round-large w3-margin-bottom">
                Меню
            </button>
            <%
                }
            %>
        </form>
    </div>
</div>
<!--
<div class="w3-card-4">
    <div class="w3-container w3-display-bottomleft w3-border">
        <h6>
            Статистика:
        </h6>
        <h6>
            <%
                Player player = (Player) request.getSession().getAttribute("player");
                out.println("Имя пользователя: " + player.getName());
            %>
        </h6>
        <h6>
            <%
                out.println("Количество попыток: " + player.getNumberOfGameOne());
            %>
        </h6>
    </div>
</div>
-->
</body>
</html>
