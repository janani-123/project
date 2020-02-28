package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class HrDto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String fullname;
	@Column(nullable=false )
	private String organisationname;
	@Column(unique=true, nullable=false )
	private String email;
	@Column(unique=true, nullable=false )
	private String mobile;
	@Column(unique=true, nullable=false )
	private String username;
	@Column(nullable=false )
	private String password;
	
	
	public HrDto() {
		super();
	}
	
	public HrDto(int id,String fullname, String organisationname, String email, String mobile, String username,
			String password) {
		super();
		this.id=id;
		this.fullname = fullname;
		this.organisationname = organisationname;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getOrganisationname() {
		return organisationname;
	}
	public void setOrganisationname(String organisationname) {
		this.organisationname = organisationname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "RegisterHrDto [id=" + id +",fullname=" + fullname + ", organisationname=" + organisationname + ", email=" + email
				+ ", mobile=" + mobile + ", username=" + username + ", password=" + password + "]";
	}
	

	

}
