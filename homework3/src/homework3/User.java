package homework3;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private Boolean availability;
	
	
	public User(int id,String firstName, String lastName, Boolean availability) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.availability = availability;
	}
	
	public int getId() {
		return id;
		}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

}
