package homework3;

public class InstructorManager extends UserManager{
	
	public void uploadCourseVideo (User user){
		System.out.println(user.getFirstName()+ " :Kurs Videosu Y�klendi");
	}
	
	public void deleteCourseVideo (User user){
		System.out.println(user.getFirstName()+ " :Kurs Videosu Silindi");
	}
	

}
