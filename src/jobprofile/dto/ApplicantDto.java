package jobprofile.dto;

public class ApplicantDto {
	
	private String fullname;
	private String mobile;
	private String username;
	private String password;
	public ApplicantDto(String fullname, String mobile, String username, String password) {
		super();
		this.fullname = fullname;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ApplicantDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegisterApplicantDto [fullname=" + fullname + ", mobile=" + mobile + ", username=" + username
				+ ", password=" + password + "]";
	}

}
