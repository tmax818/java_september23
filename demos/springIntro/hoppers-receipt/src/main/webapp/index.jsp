<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hopper Demo</title>
    </head>
<body>
    <h1>Customer name: ${receipt.name} </h1>
    <p>Item name: ${receipt.itemName}</p>
    <p>price: $${receipt.price}</p>
    <p>description: ${receipt.description}</p>
    <p>vendor: ${receipt.vendor}</p>
</body>
</html>
