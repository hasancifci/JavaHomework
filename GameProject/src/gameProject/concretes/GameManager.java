package gameProject.concretes;

import gameProject.abstracts.GameService;
import gameProject.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Gamed added " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Gamed updated " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Gamed deleted " + game.getGameName());
		
	}

}
