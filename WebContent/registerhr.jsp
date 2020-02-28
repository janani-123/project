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
<a href="login.jsp" align="center">login</a>
</div>
</div>
<div id="reg">
<form action="registerhr" name="registerhr" onsubmit="return validatehr()"method="post">

<table frame="box" align="center" bgcolor="#33C1FF ">
<tr>
<td colspan="2" align="center"><h1 style=color:blue>Register</h1></td>
</tr>
<tr>
<td><label for ="fullname" id="fullname">fullname</label></td>
<td><input type="text" name="fullname" value="${param.fullname}"></td>
<td><span>${errormessages.fullnameerror}</span></td>
</tr>
<tr>
<tr>
<td><label for ="organisationname" id="organisationame">organisationname</label></td>
<td><input type="text" name="organisationname" value="${param.organistionname}"></td>
<td><span>${errormessages.organisationnameerror}</span></td>
</tr>
<tr>
<td><label for ="email" id="email">email</label></td>
<td><input type="email" name="email"  value="${param.email}"></td>
<td><span>${errormessages.emailerror}</span></td>
</tr>
<tr>
<td><label for="mobile" id="mobile">mobile</label></td>
<td><input type="tel" name="mobile" value="${param.mobile}"></td>
<td><span>${errormessages.mobileerror}</span></td>
</tr>
<tr>
<td><label for="username" id="username">username</label></td>
<td><input type="text" name="username" value="${param.username}" ></td>
<td><span>${errormessages.usernameerror}</span></td>
</tr>
<tr>
<td><label for="password" id="password">password</label></td>
<td><input type="password" name="password" value="${param.password}"> </td>
<td><span>${errormessages.passworderror}</span></td>
</tr>



<tr>
<td colspan="2" align="center"><input type="submit" value=register></td>
</tr>
<tr>
<td><a href="login.jsp">Already have an account?</a></td>
</tr>


</table>

</form>
</div>
</div>
<script src="validationhr.js">
</script>
</body>
</html>