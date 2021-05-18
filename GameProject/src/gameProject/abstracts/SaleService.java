package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
