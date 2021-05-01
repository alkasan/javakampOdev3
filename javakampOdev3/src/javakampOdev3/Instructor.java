package javakampOdev3;

public class Instructor extends User{
	String course;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String eMail, String password, String course) {
		super(id, firstName, lastName, eMail, password);
		this.course = course;
}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
}