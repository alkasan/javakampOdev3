package javakampOdev3;

public class InstructorManager extends UserManager{

	public void addCourse (User user) {
		System.out.println("Yeni Kurs Ekledi:" +user.firstName + " " + user.lastName);
	}
	
}
