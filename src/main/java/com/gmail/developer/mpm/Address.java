package com.gmail.developer.mpm;

public class Address {
	
	private String streetAddress1;
	private String streetAddress2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	public Address(String streetAddress1, 
					String streetAddress2, 
					String city, 
					String state, 
					String postalCode,
					String country) {
		super();
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [streetAddress1=");
		builder.append(streetAddress1);
		builder.append(", streetAddress2=");
		builder.append(streetAddress2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
		
}
