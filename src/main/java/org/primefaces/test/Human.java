package org.primefaces.test;

import java.io.Serializable;

public abstract class Human implements Serializable{

	protected String gender;

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
