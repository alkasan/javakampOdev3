package javakampOdev3;

public class User {
	public User () {
		
	}
	
	int id;
	String firstName;
	String lastName;
	String eMail;
	String password;
	
	public User(int id, String firstName,String LastName, String eMail, String password) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = LastName;
		this.eMail= eMail;
		this.password=password;
	}
	
	//set get hazýr olarak çýkarttým
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


}
