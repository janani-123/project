function validatehr(){

let fullname=documents.getElementsById("fullname").value;
let organisationname=documents.getElementsById("organisationname").value;
let email=documents.getElementsById("email").value;
let mobile=documents.getElementsById("mobile").value;
let username=documents.getElementsById("username").value;
let password=documents.getElementsById("password").value;
let valid=true;
if(fullname==''){
	alert("enter fullname");
	valid= false;
	
}
if(organisationname==''){
	alert("enter organisationname");
	valid=false;
}
if(email==''){
	alert("enter email");
	valid=false

}
if((!mobile.length==10)||(mobile=='')){
alert("enter mobile");
valid=false;
}
if(username==''){
	alert("enter username");
	valid=false;
}
if(!(password.length==5)||(password==''))
	{
	alert("enter password");
	valid= false;
	}
return valid;
}