package util;

import java.util.HashMap;
import java.util.Map;

import dto.ApplicantDto;
import dto.HrDto;

public class ApplicantValidation {
	public Map<String,String> validate(ApplicantDto register) {
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
