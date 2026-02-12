package BasicPractice;

public class UserDetails {

	private int SNo;
	private String name;
	private String lastName;
	private String address;
	private int age;
	private String role;
	private String workLocation;
	private String yearsOfExperience;
	
	
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	@Override
	public String toString() {
		return "UserDetails [SNo=" + SNo + ", name=" + name + ", lastName=" + lastName + ", address=" + address
				+ ", age=" + age + ", role=" + role + ", workLocation=" + workLocation + ", yearsOfExperience="
				+ yearsOfExperience + "]";
	}

}
