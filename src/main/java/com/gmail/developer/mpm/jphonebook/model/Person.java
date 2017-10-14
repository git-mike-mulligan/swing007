package com.gmail.developer.mpm.jphonebook.model;

import java.util.Date;
import org.apache.commons.lang3.SerializationUtils;

public class Person extends AbstractModelObject {
	
	private String name;
	private String email;
	private String phone;
	private String mobilephone1;
	private String mobilephone2;
	private Date dateOfBirth;
	private Address address;
	
	public Person () {
		name = "name and person information was not provided";
	}
	
	public Person(String name, 
					String email, 
					String phone, 
					String mobilephone1, 
					String mobilephone2, 
					Date dateOfBirth, 
					Address address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mobilephone1 = mobilephone1;
		this.mobilephone2 = mobilephone2;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		firePropertyChange("name", oldValue, this.name);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		String oldValue = this.email;
		this.email = email;
		firePropertyChange("email", oldValue, this.email);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		String oldValue = this.phone;
		this.phone = phone;
		firePropertyChange("phone", oldValue, this.phone);
	}

	public String getMobilephone1() {
		return mobilephone1;
	}

	public void setMobilephone1(String mobilephone1) {
		String oldValue = this.mobilephone1;
		this.mobilephone1 = mobilephone1;
		firePropertyChange("mobilephone1", oldValue, this.mobilephone1);
		
	}

	public String getMobilephone2() {
		return mobilephone2;
	}

	public void setMobilephone2(String mobilephone2) {
		String oldValue = this.mobilephone2;
		this.mobilephone2 = mobilephone2;
		firePropertyChange("mobilephone2", oldValue, this.mobilephone2);
		
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		Date oldValue = SerializationUtils.clone((Date)this.dateOfBirth);
		this.dateOfBirth = dateOfBirth;
		firePropertyChange("dateOfBirth", oldValue, this.dateOfBirth);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		Address oldValue = SerializationUtils.clone((Address)this.address);
		this.address = address;
		firePropertyChange("dateOfBirth", oldValue, this.dateOfBirth);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(address);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", mobilephone1=");
		builder.append(mobilephone1);
		builder.append(", mobilephone2=");
		builder.append(mobilephone2);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", address=");
		builder.append("]");
		return builder.toString();
	}

}
