<%@ page import="org.example.quest.model.ScenarioOne" %>
<%@ page import="org.example.quest.model.ModelScenario" %><%--
  Created by IntelliJ IDEA.
  User: kpbl
  Date: 08.04.2025
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menu</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>
<div class="w3-container w3-blue-gray w3-opacity w3-center">
    <h1>Quests</h1>
</div>

<div class="w3-card-4">
    <div class="w3-container w3-center w3-green">
        <h2>Меню</h2>
    </div>
</div>

<div>
    <div class="w3-center w3-section w3-light-grey w3-padding">
        <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="location.href='/list'">Список игроков</button>
        <br><br>
        <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="location.href='/login'">Сменить пользователя</button>
        <br><br>
        <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="location.href='/quest?qn=one'">Квест 1</button>
    </div>
</div>

</body>
</html>
