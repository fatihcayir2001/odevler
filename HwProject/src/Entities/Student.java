package Entities;

public class Student extends User{
	int studentNumber;
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getStudentLevel() {
		return studentLevel;
	}
	public void setStudentLevel(int studentLevel) {
		this.studentLevel = studentLevel;
	}
	int studentLevel;
}
