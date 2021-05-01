package javakampOdev3;

public class StudentManager extends UserManager{
	
	public void addCard (User user) {
		System.out.println("Kart bilgisini ekledi:" +user.firstName + " " + user.lastName);
	}

	
	public void address (User user) {
		System.out.println("Adres bilgisini ekledi:" +user.firstName + " " + user.lastName);
	}
}
