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
<a href="publishedjob.jsp" align="center">publishedjob</a>
<a href="history.jsp" align="center">history</a>
</div>
</div>
<form action="addjob" method="post">

<table frame="box" align="center" bgcolor="#33C1FF ">
<tr>
<td colspan="2" align="center"><h1 style=color:blue>addjobr</h1></td>
</tr>


<tr>
<td><label for ="organisationname" id="organisationame">organisationname</label></td>
<td><input type="text" name="organisationname" ></td>
</tr>
<tr>
<td><label for ="jobdescription" >jobdescription</label></td>
<td><input type="text" name="jobdescription" ></td>
<tr>
<td><label for ="expectedexpirience" >expectedexpirience</label></td>
<td><input type="text" name="expectedexpirience" ></td>
</tr>
</tr>
<tr>
<td><label for="skills" >skills</label></td>
<td><input type="text" name="skills" ></td>

</tr>
<tr>
<td><label for="salary" >salary</label></td>
<td><input type="text" name="salary"  ></td>

</tr>
<td colspan="2" align="center"><input type="submit" value=add></td>
</tr>



</table>

</form>
</div>
</div>

</body>
</html>