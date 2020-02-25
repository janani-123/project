package util;

import java.util.HashMap;
import java.util.Map;

import dto.RegisterApplicantDto;
import dto.RegisterHrDto;

public class RegisterApplicantValidation {
	public Map<String,String> validate(RegisterApplicantDto register) {
		Map<String,String> errormessages=new HashMap<String,String>();
		
		if(register.getFullname().isEmpty()) {
			errormessages.put("fullnameerror", "enter fullname");
		}
		
		if(register.getMobile().isEmpty()) {
			errormessages.put("mobileerror", "enter mobile");
		}
		
		if(register.getUsername().isEmpty()) {
			errormessages.put("usernameerror", "enter usernameerror");
		}
		if(register.getPassword().isEmpty()) {
			errormessages.put("passworderror", "enter password");
		}
		
		
		return errormessages;
		
	
	}
	
	

}
