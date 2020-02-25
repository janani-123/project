<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body,html{
height:100%;
}
#heading{
background-image:url("jobnew.jpg");
height:100%;
background-repeat:no-repeat;
background-position:center;
background-size:cover;
postion:relative;
}

div#header{
display: flex;
 justify-content: flex-start;
 border: 1px solid black;
 background-color:#33C1FF;

}
#header>#title>h1{
display:inline;
}
#header > #list {
    display: flex;
    flex:2;
    justify-content: flex-end;
}
#header > #list>ul {
    display: flex;
    list-style-type: none;
    flex:2;
    justify-content: flex-end;
    
}
#header > #list>ul>li{
flex-basis:100px;
}
  


</style>
</head>
<body>
<div id="heading">
<div id="header">
<div id="title">
<h1 style=color:blue;font-type:bold;font-size:30px>App</h1>
</div>
<div id="list">
<ul>
<li><a  class="menu" href="login.jsp">login</a></li>
<li><a class="menu" href="register.jsp">register</a><li>
</ul>
</div>
</div>
</div>
</body>
</html>