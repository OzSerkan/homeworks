package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface ISellService {
	void buy(Gamer gamer, Game game, Campaign campaign);
	void buy(Gamer gamer, Game game);
}
