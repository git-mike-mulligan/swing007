package com.gmail.developer.mpm.jphonebook.model;

import java.util.Date;
import org.apache.commons.lang3.SerializationUtils;

public class Person extends AbstractModelObject {
	
	private String name;
	private String email;
	private String phone;
	private String mobilePhone1;
	private String mobilePhone2;
	private Date dateOfBirth;
	private Address address;
	
	public Person () {
		name = "name and person information was not provided";
	}
	
	public Person(String name, 
					String email, 
					String phone, 
					String mobilePhone1, 
					String mobilePhone2, 
					Date dateOfBirth, 
					Address address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mobilePhone1 = mobilePhone1;
		this.mobilePhone2 = mobilePhone2;
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

	public String getMobilePhone1() {
		return mobilePhone1;
	}

	public void setMobilePhone1(String mobilePhone1) {
		String oldValue = this.mobilePhone1;
		this.mobilePhone1 = mobilePhone1;
		firePropertyChange("mobilePhone1", oldValue, this.mobilePhone1);
		
	}

	public String getMobilePhone2() {
		return mobilePhone2;
	}

	public void setMobilePhone2(String mobilePhone2) {
		String oldValue = this.mobilePhone2;
		this.mobilePhone2 = mobilePhone2;
		firePropertyChange("mobilePhone2", oldValue, this.mobilePhone2);
		
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
		builder.append(", mobilePhone1=");
		builder.append(mobilePhone1);
		builder.append(", mobilePhone2=");
		builder.append(mobilePhone2);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", address=");
		builder.append("]");
		return builder.toString();
	}

}
