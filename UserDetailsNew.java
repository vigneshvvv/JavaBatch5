package BasicPractice;

public class UserDetailsNew {
	

	private int id;

	private String userName;
	private int age;
	private int salary;
	
	public UserDetailsNew(int id, String userName, int age, int salary) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "UserDetailsNew [id=" + id + ", userName=" + userName + ", age=" + age + ", salary=" + salary + "]";
	}


}
