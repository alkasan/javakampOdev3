package javakampOdev3;

public class UserManager {
	
	public void Login(int logType , User user) {
		if(logType ==1) {
			System.out.println("Ogrenci kaydiniz alinmistir:" + user.firstName + " " + user.lastName);
		}
		else if (logType ==2) {
			System.out.println("Egitmen kaydiniz alinmistir:" +user.firstName + " " + user.lastName);
		}
	}
	
	
	public void Delete(int logType , User user) {
		if(logType ==1) {
			System.out.println("Ogrenci kaydiniz silinmistir:" + user.firstName + " " + user.lastName);
		}
		else if (logType ==2) {
			System.out.println("Egitmen kaydiniz silinmistir:" +user.firstName + " " +user.lastName);
		}
	}
	
	public void Update(int logType , User user) {
		if(logType ==1) {
			System.out.println("Ogrenci kaydiniz güncellenmistir:" + user.firstName + " " + user.lastName);
		}
		else if (logType ==2) {
			System.out.println("Egitmen kaydiniz güncellenmistir:" +user.firstName + " " + user.lastName);
		}
	}

}
