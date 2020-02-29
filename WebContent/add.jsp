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
 background-color:white;

}
#header>#title>h1{
display:inline;
}
#header > #list {
    display: flex;
    flex:2;
    justify-content: flex-end;
}
#header > #list > ul{
    display: flex;
    list-style-type: none;
    flex:2;
    justify-content: flex-end;
}
#header > #list > ul > li {
    flex-basis: 100px;
}
</style>
</head>
<body>
<div id="header">
<div id="title">
<h1 style=color:blue;font-type:bold;font-size:30px>App</h1>
</div>
<div id="list">
<ul>
<li><a href="addjob.jsp">addjob</a></li>
<li><a href="published.jsp">published</a></li>
<li><a href="history.jsp">published</a></li>

</ul>
</div>
</div>
</body>
</html>