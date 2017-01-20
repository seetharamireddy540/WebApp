<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Token Post</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>


<p>code :-><%= session.getAttribute("code") %></p>
<p>id_token :-><%= session.getAttribute("id_token") %></p>
<p>error :-><%= session.getAttribute("error") %></p>

</body>
</html>