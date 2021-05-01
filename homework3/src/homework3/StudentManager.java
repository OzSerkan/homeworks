package homework3;

public class StudentManager extends UserManager{
	
	public void regForCourse (User user) {
		System.out.println(user.getFirstName()+ " :Kursa kayýt olundu");
	}
	
	public void finishCourse (User user) {
		System.out.println(user.getFirstName()+ " :Kurs bitirildi");
	}

}
