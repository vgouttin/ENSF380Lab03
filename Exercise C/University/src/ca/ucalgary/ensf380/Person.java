package ca.ucalgary.ensf380;

public class Person {
	//Attributes
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private int lastPersonalNumber = 0;
	
	//Setters and Getters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	//Methods
	protected String nextPersonalNumber() {
		lastPersonalNumber++;
		return String.format("%06d", lastPersonalNumber);
	}
	
	public boolean hasValidAddress() {
		return this.address != null && this.address.validate();
	}
}
