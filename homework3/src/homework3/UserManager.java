package homework3;

public class UserManager {
	
	public void login (User user) {
	       System.out.println(user.getFirstName()+ " :Giri� yapt�");
	    }
	
	public void logout (User user) {
	       System.out.println(user.getFirstName()+" :��k�� Yapt�");
	    }
	
	public void selectAvailability (User user) {
	       if(user.getAvailability()==true) {
	    	   System.out.println(user.getFirstName()+ " :�uan online");
	       }
	       else {
	    	   System.out.println(user.getFirstName()+ " :�uan offline");
	       }
	       
	    }
		
}
