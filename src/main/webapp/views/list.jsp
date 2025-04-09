<%@ page import="org.example.quest.entities.Player" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kpbl
  Date: 08.04.2025
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Players</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>
<div class="w3-container w3-blue-gray w3-opacity w3-center">
    <h1>Quests</h1>
</div>

<div class="w3-card-4">
   <div class="w3-container w3-center w3-green">
       <h2>Таблица игроков</h2>
   </div>
</div>

<div class="w3-container w3-section w3-light-grey w3-padding">
    <table class="w3-table-all w3-striped w3-centered">
        <tr>
            <th>Имя пользователя</th>
            <th>Количество попыток</th>
        </tr>
        <%
            List<Player> players = (List<Player>) request.getAttribute("players");
            if (players != null && !players.isEmpty()) {
                for (Player p : players) {
        %>
        <tr>
            <td>
                <%
                    out.print(p.getName());
                %>
            </td>
            <td>
                <%
                    out.print("Квест 1: "+p.getNumberOfGameOne());
                %>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
</div>
</body>
</html>
