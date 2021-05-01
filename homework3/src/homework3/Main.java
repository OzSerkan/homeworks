package homework3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(10,"Engin","DEMİROĞ",true,3,"şifre");
		Student student = new Student(7,"Serkan Eren","Özarslan",false,100,"Geçti");
		
		
		UserManager usermanager = new UserManager();
		StudentManager studentmanager = new StudentManager();
		InstructorManager instructormanager = new InstructorManager();
		
        usermanager.login(student);
        usermanager.logout(student);
        
        usermanager.login(instructor);
        usermanager.logout(instructor);
        
        usermanager.selectAvailability(instructor);
        usermanager.selectAvailability(instructor);
        
        usermanager.selectAvailability(student);
        usermanager.selectAvailability(student);
        
        instructormanager.deleteCourseVideo(instructor);
        instructormanager.uploadCourseVideo(instructor);
        
        studentmanager.regForCourse(student);
        studentmanager.finishCourse(student);
        
        
        
        
	}

}
