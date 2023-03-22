<!DOCTYPE HTML>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <table border="1">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${employeesView}">
                <td th:text="${user.id}"></td>
                <td th:text="${user.firstName}"></td>
                <td th:text="${user.lastName}"></td>
                <td th:text="${user.email}"></td>
            </tr>
        </tbody>
    </table>
    <h1>${employeesView}</h1>

    <h1 th:text="${employeesView}"></h1>

</body>
</html>