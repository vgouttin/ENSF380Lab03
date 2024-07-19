package ca.ucalgary.ensf380;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
//Setter and Getters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	//Methods
	
	public boolean validate() {
		   return (street != null && !street.trim().isEmpty()) &&
	               (city != null && !city.trim().isEmpty()) &&
	               (state != null && !state.trim().isEmpty()) &&
	               (postalCode != null && postalCode.matches("[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d") &&
	               country != null && !country.trim().isEmpty());
	}
	
	public String outputAsLabel() {
		return (this.street + ", " + this.city + ", " +  this.state +", "+ this.country + ", "+ this.postalCode);
	}
	
}
