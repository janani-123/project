package jobprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String organisationname;
	@Column(nullable=false)
	private String jobdescription;
	@Column(nullable=false)
	private String expectedexpirience;
	@Column(nullable=false)
      private String skills;
    @Column(nullable=false)
     private String salary;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganisationname() {
		return organisationname;
	}
	public void setOrganisationname(String organisationname) {
		this.organisationname = organisationname;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getExpectedexpirience() {
		return expectedexpirience;
	}
	public void setExpectedexpirience(String expectedexpirience) {
		this.expectedexpirience = expectedexpirience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Job(int id,String organisationname, String jobdescription, String expectedexpirience, String skills,
			String salary) {
		super();
		this.id=id;
		this.organisationname = organisationname;
		this.jobdescription = jobdescription;
		this.expectedexpirience = expectedexpirience;
		this.skills = skills;
		this.salary = salary;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddJob [id=" +id+ ",organisationname=" + organisationname + ", jobdescription=" + jobdescription
				+ ", expectedexpirience=" + expectedexpirience + ", skills=" + skills + ", salary=" + salary + "]";
	}
    

}
