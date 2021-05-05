import abstracts.IGamerCheckService;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerCheckManager;
import concrete.GamerManager;
import concrete.MernisManager;
import concrete.OrderManager;
import concrete.SellManager;
import entities.Campaign;
import entities.Gamer;
import entities.Order;
import entities.Game;

public class Main {
	
	public static void main(String[] args) {
		
		CampaignManager campaignManager=new CampaignManager();
		GameManager gameManager =new GameManager();
		GamerManager gamerManager = new  GamerManager(new MernisManager());
		OrderManager orderManager =new OrderManager();
		SellManager sellManager =new SellManager(new OrderManager());
		
		Campaign kampanya1=new Campaign (3,"test kampanya",100);
		Game game1 =new Game(1,"CSGO",25);

			
		
		Gamer zafer=new Gamer(4, 213123123L,"Serkan","Özarslan",2004);
		
		
		
		Order order=new Order(1,2,3,4,5,50,25,75);
		
		
	
		
	}
}
