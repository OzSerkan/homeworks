package concrete;

import abstracts.IGamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean check(Gamer gamer) {			
		return true;		 		
	}
}
