package userinfo;

public class User {
	
	private long id;
	private String FirstName;
	private String LastName;
	private int Age;
	
	//ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//FirstName
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	//Last Name 
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	//Age 
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
