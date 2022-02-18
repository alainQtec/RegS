/*
 * File name student.java 
 */


package com.regs;

public class student extends person {
    private String rollNumber;
    private int totalMarks;
    private int standard;

    /*
     * overloaded constructor to set all
     * student object properties at once
     */

    public Student(String name, String address, String rollNumber, int number, int totalMarks){
        //set object properties from the arguments/parameters

        this.rollNumber = rollNumber;
	this.address = address;
	this.number = number;
        this.name = name;
	this.fullname = firstName + lastName;
        this.standard = standard;
        this.totalMarks = totalMarks;
    }

    /* Methods to get and set the student properties */
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    /*
     * This method will product nice summary of Student object
     * when printed using System.out.println in the format below
     *
     * [01 : Raj : 10th : 200]
     */
    public String toString(){

        StringBuilder sbStudent = new StringBuilder();

        sbStudent.append("[");

        sbStudent.append(getRollNumber());
        sbStudent.append(" : ");
        sbStudent.append(getName());
        sbStudent.append(" : ");
        sbStudent.append(getStandard());
        sbStudent.append(" : ");
        sbStudent.append(getTotalMarks());

        sbStudent.append("]");

        return sbStudent.toString();
    }
}
