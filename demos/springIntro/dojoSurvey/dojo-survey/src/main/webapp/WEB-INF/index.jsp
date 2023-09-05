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
    <div class="container">
        <form action="/survey" method="GET" model="survey">
            <div class="form-group">
              <label for="exampleFormControlInput1">Name</label>
              <input name="name" type="text" class="form-control" id="exampleFormControlInput1">
            </div>
            <div class="form-group">
              <label for="exampleFormControlInput1">Location</label>
              <input name="location" type="text" class="form-control" id="exampleFormControlInput1">
            </div>
            <div class="form-group">
              <label for="exampleFormControlSelect1">Language</label>
              <select name="language" class="form-control" id="exampleFormControlSelect1">
                <option>Java</option>
                <option>Python</option>
                <option>JavaScript</option>
                <option>C</option>
                <option>C++</option>
              </select>
            </div>
           
            <input type="submit" value="submit">
          </form>

          <p>name: ${name}</p>
          <p>location: ${location}</p>
          <p>language: ${language}</p>
    </div>
   
</body>
</html>

