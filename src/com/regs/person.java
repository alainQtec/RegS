/*
 * File name person.java 
 */

package com.alainqtec.registrationSystem;

public class person {

    private String firstName;
    private String lastName;
    // private String address;
    private String number;
    private String dateOfBirth;

    public String toString() {
        return firstName + "" + lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getNumber(){
	return number;
    }

    public String getDateOfBirth(){
	return dateOfBirth;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return o != null && getClass() == o.getClass();
    }

    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public person(String name, String address, int number){
	//this.name = firstName + lastName;
	this.address = address;
	//this.number = number;
    }

}
