package com.gmail.developer.mpm.jphonebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lobas_av
 * 
 */
public class PhoneGroup extends AbstractModelObject {
	private List<Person> persons = new ArrayList<Person>();
	private String name;

	public PhoneGroup() {
	}

	public PhoneGroup(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		firePropertyChange("name", oldValue, this.name);
	}

	public void addPerson(Person person) {
		List<Person> oldValue = this.persons;
		this.persons = new ArrayList<Person>(this.persons);
		this.persons.add(person);
		firePropertyChange("persons", oldValue, this.persons);
		firePropertyChange("personCount", oldValue.size(), this.persons.size());
	}

	public void removePerson(Person person) {
		List<Person> oldValue = this.persons;
		this.persons = new ArrayList<Person>(this.persons);
		this.persons.remove(person);
		firePropertyChange("persons", oldValue, this.persons);
		firePropertyChange("personCount", oldValue.size(), this.persons.size());
	}

	public List<Person> getPersons() {
		return this.persons;
	}
	
	public int getPersonCount() {
		return this.persons.size();
	}
}
