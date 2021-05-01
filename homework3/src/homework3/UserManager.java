package homework3;

public class UserManager {
	
	public void login (User user) {
	       System.out.println(user.getFirstName()+ " :Giriþ yaptý");
	    }
	
	public void logout (User user) {
	       System.out.println(user.getFirstName()+" :Çýkýþ Yaptý");
	    }
	
	public void selectAvailability (User user) {
	       if(user.getAvailability()==true) {
	    	   System.out.println(user.getFirstName()+ " :Þuan online");
	       }
	       else {
	    	   System.out.println(user.getFirstName()+ " :Þuan offline");
	       }
	       
	    }
		
}
