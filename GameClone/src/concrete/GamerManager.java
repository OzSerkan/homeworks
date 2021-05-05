package concrete;

import java.util.ArrayList;
import java.util.List;
import abstracts.IGamerCheckService;
import abstracts.IGamerService;
import entities.Gamer;


public class GamerManager implements IGamerService  {
	
	private IGamerCheckService gamerCheckService;
	
	private List<Gamer> gamers = new ArrayList<Gamer>();

	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		
		Gamer gamer1 = new Gamer(1,12311232232L,"Serkan","Özarslan",2004);
		Gamer gamer2 = new Gamer(2,12311232232L,"Mehmetcan","Kýlýç",2004);
		Gamer gamer3 = new Gamer(3,12311232232L,"Servet","Özarslan",1998);
		
		gamers.add(gamer1);					
		gamers.add(gamer2);		
		gamers.add(gamer3);
	}

	@Override
	public void add(Gamer gamer) {	
		
		if(gamerCheckService.check(gamer)) {					
			printAllItems();		
			gamers.add(gamer);		
			printAllItems();		
		}
		else {
			System.out.println("Doðrulanamadý!");
		}

	}

	@Override
	public void update(Gamer gamer) {		

		printAllItems();
		
        Gamer gamerToUpdate = gamers.stream()                
        		.filter(g -> g.getId() == gamer.getId())
                .findFirst()
                .orElse(null);
        
        if(gamerToUpdate != null){
        	System.out.println("Bulundu: " + gamerToUpdate.getFirstName());
        	
        	gamerToUpdate.setNationalityId(gamer.getNationalityId());
        	gamerToUpdate.setLastName(gamer.getLastName());
        	gamerToUpdate.setFirstName(gamer.getFirstName());
        	gamerToUpdate.setLastName(gamer.getLastName());
        	gamerToUpdate.setDateOfBirth(gamer.getDateOfBirth());

        	System.out.println("Güncellendi: "+ gamerToUpdate.getFirstName());  
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamadý.");
        }	
	}

	@Override
	public void delete(int gamerId) {
		Gamer gamerToDelete = gamers.stream()                
        		.filter(s -> s.getId() == gamerId)
                .findFirst()
                .orElse(null);
		
        if(gamerToDelete != null){
        	System.out.println("Silindi: "+ gamerToDelete.getFirstName());
        	gamers.remove(gamerToDelete);
        	printAllItems();
        
        }
        else {
        	System.out.println("Bulunamadý.");
        }		
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Gamer item : gamers) {
			System.out.println(item.getFirstName());
		}
    	System.out.println("-----------------------------------------");		
	}
}