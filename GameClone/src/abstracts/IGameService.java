package abstracts;

import entities.Game;

public interface IGameService {
	
	void add(Game game);
	void update(Game game);
	void delete(int gameId);
	void printAllItems();
			

		

}
