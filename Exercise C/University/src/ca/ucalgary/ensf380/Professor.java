package ca.ucalgary.ensf380;

public class Professor extends Person{
	
	//Attributes
	private String teacherNumber;
	private double salary;
	
	//Setters and getters
		public String getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
