package bank.model;

public class Address {
	private String street;
	private String zip;
	private String city;
	private String state;
	public Address(String street, String zip, String city, String state) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
	}
}
