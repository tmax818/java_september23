<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Save Travels</h1>
   <table class="table">
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>amount</th>
            <th>actions</th>
        </tr>
    </thead>
    <tbody>

            <tr>
                <td>
                    <a href="/expenses/${expense.id}">
                        ${expense.name}</td>
                    </a>
                <td>${expense.vendor}</td>
                <td>$${expense.amount}</td>
                <td>
                    <a href="#">edit</a>
                </td>
            </tr>

    </tbody>
   </table>
</body>
</html>