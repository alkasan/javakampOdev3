package javakampOdev3;

public class Student extends User{
	
	String address;
	String cardNumber;
	
	public Student(int id, String firstName, String lastName, String eMail, String password, String address, String cardNumber) {
		super(id, firstName, lastName, eMail, password);
		this.address=address;
		this.cardNumber=cardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
