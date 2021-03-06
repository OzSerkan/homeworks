package concrete;

import java.util.ArrayList;
import java.util.List;

import abstracts.ICampaignService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Campaign;


public class CampaignManager implements ICampaignService {
	
	private List<Campaign> campaigns = new ArrayList<Campaign>();

	public CampaignManager() {
		Campaign campaign1 = new Campaign(1, "Y?zde Otuz", 30);
		Campaign campaign2 = new Campaign(2, "Y?zde Elli", 50);
		Campaign campaign3 = new Campaign(3, "Y?zde Yetmi?", 70);
		
		campaigns.add(campaign1);					
		campaigns.add(campaign2);		
		campaigns.add(campaign3);		
	}

	@Override
	public void add(Campaign campaign) {
		printAllItems();
		campaigns.add(campaign);	
		printAllItems();
	}

	@Override
	public void update(Campaign campaign) {
		
		Campaign campaignToUpdate = campaigns.stream()                
        		.filter(c -> c.getId() == campaign.getId())
                .findFirst()
                .orElse(null);
        
        if(campaignToUpdate != null){
        	System.out.println("Bulundu: " + campaignToUpdate.getId() + " " + campaignToUpdate.getName() + " " + campaignToUpdate.getDiscountRate());
        	
        	campaignToUpdate.setName(campaign.getName());
        	campaignToUpdate.setDiscountRate(campaign.getDiscountRate());
        	
        	System.out.println("G?ncellendi: " + campaignToUpdate.getId() + " " + campaignToUpdate.getName() + " " + campaignToUpdate.getDiscountRate());         
        
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamad?.");
        }			
	}

	@Override
	public void delete(int campaignId) {
		Campaign campaignToDelete = campaigns.stream()                
        		.filter(c -> c.getId() == campaignId)
                .findFirst()
                .orElse(null);
		
        if(campaignToDelete != null){
        	
        	printAllItems();
        	
        	System.out.println("Silindi: " + campaignToDelete.getId() + " " +         
        			campaignToDelete.getName() + " " + campaignToDelete.getDiscountRate());
        	
        	campaigns.remove(campaignToDelete);
        	
        	printAllItems();        	

        }
        else {
        	System.out.println("Bulunamad?.");
        }       	
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Campaign campaign : campaigns) {
			System.out.println(campaign.getId() + " " + campaign.getName() + " " + campaign.getDiscountRate());
		}
    	System.out.println("-----------------------------------------");
	}
}