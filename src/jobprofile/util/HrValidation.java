package jobprofile.util;

import java.util.HashMap;
import java.util.Map;

import jobprofile.dto.HrDto;

public class HrValidation {
	
	
			public Map<String,String> validate(HrDto register) {
				Map<String,String> errormessages=new HashMap<String,String>();
				
				if(register.getFullname().isEmpty()) {
					errormessages.put("fullnameerror", "enter fullname");
				}
				if(register.getEmail().isEmpty()) {
					errormessages.put("emailerror", "enter email");
				}
				if(register.getOrganisationname().isEmpty()) {
					errormessages.put("organisationnameerror", "enter organisation");
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
			
	


