package gameProject.concretes;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Game named " + game.getGameName() + " sold to gamer " + gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Game named " + game.getGameName() + " discount applied " + campaign.getCampaignName() + " sold to gamer " + gamer.getFirstName());
	}

}
