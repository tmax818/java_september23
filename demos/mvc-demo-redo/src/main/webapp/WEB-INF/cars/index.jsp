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
    <table class="table">
        <thead>
          <tr>
            <th scope="col">id</th>
            <th scope="col">make</th>
            <th scope="col">model</th>
            <th scope="col">year</th>
            <th scope="col">actions</th>

          </tr>
        </thead>
        <tbody>
           <c:forEach var="car" items="${cars}">
               <tr>

                   <td><c:out value="${car.id}"></c:out></td>
                   <td><c:out value="${car.make}"></c:out></td>
                   <td><c:out value="${car.carModel}"></c:out></td>
                   <td><c:out value="${car.year}"></c:out></td>
                   <td><a href="/cars/${car.id}">show</a>
                    <form action="/cars/${car.id}" method="post">
                      <input type="hidden" name="_method" value="delete">
                      <input type="submit" value="Delete">
                  </form>
                  </td>
                </tr>
            </c:forEach> 

        </tbody>
      </table>
      <a href="/cars/new" class="btn btn-outline-primary">add car</a>
      <a href="/logout" class="btn btn-danger">logout</a>
   </div>
</body>
</html>

