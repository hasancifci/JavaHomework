package gameProject.concretes;

import gameProject.abstracts.GamerCheckService;
import gameProject.entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean chechIfRealPerson(Gamer gamer) {
		return true;
	}
	
}
