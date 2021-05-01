package homework3;

public class Student extends User{
	
	private int grades;
	private String passOrFail;

	public Student(int id, String firstName, String lastName, Boolean availability, int grades, String passOrFail) {
		super(id, firstName, lastName, availability);
		this.grades = grades;
		this.passOrFail = passOrFail;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}

	public String getPassOrFail() {
		return passOrFail;
	}

	public void setPassOrFail(String passOrFail) {
		this.passOrFail = passOrFail;
	}
	
	

}
