package gameProject.concretes;

import gameProject.abstracts.GamerCheckService;
import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService{

	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.chechIfRealPerson(gamer)) {
			System.out.println("Gamer added " + gamer.getFirstName());
		}else {
			System.out.println("Not a valid gamer!");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted " + gamer.getFirstName());
		
	}

}
