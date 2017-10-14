package com.gmail.developer.mpm.jphonebook.model;

import java.util.ArrayList;
import java.util.List;

public class PhoneGroups extends AbstractModelObject {
	private List<PhoneGroup> groups = new ArrayList<PhoneGroup>();

	public void addGroup(PhoneGroup group) {
		List<PhoneGroup> oldValue = this.groups;
		this.groups = new ArrayList<PhoneGroup>(this.groups);
		this.groups.add(group);
		firePropertyChange("groups", oldValue, this.groups);
	}

	public void removeGroup(PhoneGroup group) {
		List<PhoneGroup> oldValue = this.groups;
		this.groups = new ArrayList<PhoneGroup>(this.groups);
		this.groups.remove(group);
		firePropertyChange("groups", oldValue, this.groups);
	}

	public List<PhoneGroup> getGroups() {
		return this.groups;
	}
}