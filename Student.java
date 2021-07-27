package com.lti.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
private int id;
private String name;
private LocalDate dateOfBirth;
private static String collegeName;
private String[] phoneNumbers;
public Student(int id, String name, LocalDate dateOfBirth,String[] phoneNumbers) {
	System.out.println("Parameter Constructor");
	this.id = id;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.phoneNumbers=phoneNumbers;
	
}
public Student(int id, String name, LocalDate dateOfBirth) {
	
	this.id = id;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	
}
static {
	collegeName="LTI Institute";
	//System.out.println("Static Block");
}
public Student() {
	System.out.println("Default Constructor");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public static String getCollegeName() { //static variables can be accessed/modified/initializes only by static methods
	return collegeName;
}
public static void setCollegeName(String collegeName) {
	Student.collegeName = collegeName;
}
public String[] getPhoneNumbers() {
	return phoneNumbers;
}
public void setPhoneNumbers(String[] phoneNumbers) {
	this.phoneNumbers = phoneNumbers;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + Arrays.hashCode(phoneNumbers);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (dateOfBirth == null) {
		if (other.dateOfBirth != null)
			return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (!Arrays.equals(phoneNumbers, other.phoneNumbers))
		return false;
	return true;
}



}
