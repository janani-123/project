<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
   <table>
   <tr>
   <td><label for="firstname">firstname</label></td>
   <td><input type="text" name="firstname"></td>
   </tr>
  <br>
  <tr>
  <td><label for="lastname">lastname</label></td>
  <td><input type="text" name="lastname"></td>
  </tr>
  
  <br>
  <tr>
  <td><label for="gender">gender</label></td>
  <td><label for="male">male</label>
  <input type="radio"name="gender" value="male">
  <label for="female">female</label>
  <input type="radio"name="gender" value="female"></td>
  </tr>
  <br>
  <tr>
  <td><label for="nationality">natioanlity</label></td>
  <td><input type="drpdownbox"name="nationality">
   <select id = "nationality">
               <option value = "1">india</option>
               <option value = "2">america</option>
               <option value = "3">london</option>
               <option value = "4">france</option></td>
             </select>
			</tr>
			
  <tr>
<td><label for="educational qualification">educational qualification</label></td>
  <td><input type="dropdownbox "name="educational qualification">
     <select id = "educational qualification">
               <option value = "1">B.E</option>
               <option value = "2">B.tech</option>
               <option value = "3">B.com</option>
               <option value = "4">B.A</option></td>
             </select>
			<br>
<tr>
<td><label for=" status">employee status</label></td>
<td><label for="fresher">fresher</label>
<input type="radio" name="employee status" value="fresher">
<label for="non-fresher">non-fresher</label>
<input type="radio" name="employee status" value="non-fresher"></td>
</tr>
<br>
<tr>
<td><label for="expirence">experience</label></td>
<td><input type="dropdownbox" name="experience">
<select id = "experience">
               <option value = "1">1 year</option>
               <option value = "2">1-5 year</option>
               <option value = "3">5-10 year</option>
               <option value = "4">more than 10 year</option></td>
             </select>
			 </tr>
			<br>
<tr>
<td><label for="languages">languages</label></td>

<td><label for="languages">english</label>
<input type="checkbox" name="languages" value=english">
<label for="non-fresher">french</label>
<input type="checkbox" name="languages" value="french"></td>
</tr>
<tr><td colspan="2" align="center"><input type="submit"value=register></td>
</tr>
</table>
</form>
</body>
</html>