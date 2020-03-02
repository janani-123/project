package jobprofile.util;

import java.util.HashMap;
import java.util.Map;

import jobprofile.dto.Job;

public class AddJobValidate {
	public Map<String, String> validate(Job add) {
		Map<String, String> errormessages = new HashMap<String, String>();

		if (add.getOrganisationname().isEmpty()) {
			errormessages.put("organisationnameerror", "enter organisation name");
		}

		if (add.getJobdescription().isEmpty()) {
			errormessages.put("jobdescriptionerror", "enter jobdescription");
		}
		if (add.getExpectedexpirience().isEmpty()) {
			errormessages.put("expirienceerror", "enter expirience");
		}

		if (add.getSkills().isEmpty()) {
			errormessages.put("skillserror", "enter skills");
		}

		if (add.getSalary().isEmpty()) {
			errormessages.put("salaryerror", "enter salaryerror");
		}

		return errormessages;

	}

}
