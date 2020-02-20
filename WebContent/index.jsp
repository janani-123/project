<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div#header{

display: flex;
 justify-content: flex-start;
 border: 1px solid black;
 background-color:navy;
}

#header > #menu {
    display: flex;
    flex:2;
    justify-content: flex-end;
}
#header>#title>h1{
display:inline;
}


#header > #menu > ul{
    display: flex;
    list-style-type: none;
    flex:2;
    justify-content: flex-end;
}
#header > #menu > ul > li {
    flex-basis: 100px;
}
</style>
</head>
<body>
<div id="header">
<div id="title">
<h1 style=color:blue;font-type:bold;font-size:70px>APP</h1>
</div>
<div id="menu">
<ul>
<li><a href="login.jsp">login</a></li>
<li>register</li>
</ul>
</div>

</div>
</body>

</body>
</html>