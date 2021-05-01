package homework3;

public class Instructor extends User{
	
	private int numberOfHisCourses;
	private String insPassword;
	
	
	public Instructor (int id,String firstName, String lastName, Boolean availability, int numberOfHisCourses,String insPassword) {
		super(id,firstName,lastName,availability);
		this.numberOfHisCourses = numberOfHisCourses;
		this.insPassword = insPassword;
		
	}

	public int getNumberOfHisCourses() {
		return numberOfHisCourses;
	}

	public void setNumberOfHisCourses(int numberOfHisCourses) {
		this.numberOfHisCourses = numberOfHisCourses;
	}

	public String getInsPassword() {
		return insPassword;
	}

	public void setInsPassword(String insPassword) {
		this.insPassword = insPassword;
	}
	
	
		
	

}
