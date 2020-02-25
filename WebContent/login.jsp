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
 background-color:#33C1FF ;
}

#header > #login {
    display: flex;
    flex:2;
    justify-content: flex-end;
    margin-top:10px;
}
#header>#title>h1{
display:inline;
}
#reg{

display: block;
 margin-top:25px; 
text-align: center;
background-color:white;
display:inline-block;
}
label{
color:blue;
}
</style>
</head>
<body>
<div id="heading">
<div id="header">
<div id="title">
<h1 style=color:blue;font-type:bold;font-size:60px>App</h1>
</div>
<div id="login">
<a href="register.jsp" align="center">register</a>
</div>
</div>
<div id="reg">
<form>
<table align="center" frame="box" bgcolor="#33C1FF ">
<tr>
<td colspan="2" align="center"><h1 style=color:blue>login</h1></td>
</tr>
<tr>
<td><label for ="hr">hr</label></td>
<td><a href="loginhr.jsp">hrlogin</a></td>

</tr>
<tr>
<tr>
<td><label for ="applicant">applicant</label></td>
<td><a href="loginapplicant.jsp">applicantlogin</a></td>
</tr>
<tr>
<td><a href="register.jsp">newregister?</a></td>
</tr>
</table>

</form>
</div>
</div>
</body>
</html>