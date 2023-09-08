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
<html data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="container">
   

  

    <h2>Add car</h2>

    <form:form action="/cars" method="POST" modelAttribute="car">
      <form:label path="driver">Drivers</form:label>
      <form:select path="driver">
        <c:forEach var="driver" items="${drivers}">
          <option value="${driver.id}">${driver.name}</option>
        </c:forEach>
      </form:select>
      <br>
      <form:label path="make">make</form:label>
      <form:input class="form-control" path="make" />
      <form:errors path="make"/>

      <form:label path="carModel">carModel</form:label>
      <form:input class="form-control" path="carModel" />
      <form:errors path="carModel"/>

      <form:label path="year">year</form:label>
      <form:input type="number" class="form-control" path="year" />
      <form:errors path="year"/>

      <input type="submit" value="add car">


    </form:form>

</body>


</html>

