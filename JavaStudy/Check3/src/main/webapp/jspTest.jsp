<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="main">
<table>
  <tr>
    <th>name</th>
    <td><input name="name" type="text"></td>
  </tr>
  <tr>
    <th>id</th>
    <td><input name="id" type="text"></td>
  </tr>
</table>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>