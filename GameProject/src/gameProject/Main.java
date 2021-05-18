package gameProject;

import java.time.LocalDate;

import gameProject.adapters.MernisServiceAdapter;
import gameProject.concretes.CampaignManager;
import gameProject.concretes.GameManager;
import gameProject.concretes.GamerManager;
import gameProject.concretes.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Hasan","Çifçi",LocalDate.of(1998,12,26),"17915692640");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		Game game1 = new Game(1,"Valorant",200);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1 = new Campaign(1,"Winter Campaign",50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game1, gamer1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.saleWithCampaign(game1, gamer1, campaign1);

	}

}
