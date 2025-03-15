<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
    <link rel="stylesheet" href="/static/styles.css">
</head>
<body>
    <h1>Omikuji Form</h1>
    <form action="/omikuji/process" method="POST">
        <label for="number">Pick a number:</label>
        <input type="number" id="number" name="number" required><br><br>

        <label for="city">Favorite city:</label>
        <input type="text" id="city" name="city" required><br><br>

        <label for="person">Name of a person:</label>
        <input type="text" id="person" name="person" required><br><br>

        <label for="hobby">Favorite hobby:</label>
        <input type="text" id="hobby" name="hobby" required><br><br>

        <label for="thing">Favorite thing:</label>
        <input type="text" id="thing" name="thing" required><br><br>

        <label for="message">Inspirational message:</label>
        <input type="text" id="message" name="message" required><br><br>

        <button type="submit">Get My Fortune</button>
    </form>
</body>
</html>