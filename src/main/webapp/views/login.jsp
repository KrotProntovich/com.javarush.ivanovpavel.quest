<%--
  Created by IntelliJ IDEA.
  User: kpbl
  Date: 08.04.2025
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>
<body>
<div class="w3-container w3-blue-gray w3-opacity w3-center">
    <h1>Quests</h1>
</div>
<div class="w3-card-4">
    <div class="w3-container w3-center w3-green">
        <h2>Пожалуйста, представьтесь!</h2>
    </div>
</div>
<form method="post" class="w3-section w3-light-grey w3-padding">
  <label>Введите имя:
    <input type="text" required id="name-n1" name="name" minlength="1" maxlength="12" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
  </label>
  <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Далее</button>
</form>
</body>
</html>
