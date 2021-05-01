package javakampOdev3;

public class Main {

	public static void main(String[] args) {
		User user1 = new Student(1,"Esra","Alkasan","esraalkasan@gmail.com","123","ıstanbul","10");
		User user2 = new Instructor(2, "Engin", "Demirog", "e@gmail.com", "456", "JAVA");
	

	UserManager userManager1 =new UserManager();
	userManager1.Login(1,user1);
	
	UserManager userManager2 =new UserManager();
	userManager2.Login(2,user2);

	StudentManager studentManager = new StudentManager();
	studentManager.addCard(user1);
	studentManager.address(user1);
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.addCourse(user2);
	
	}
}
