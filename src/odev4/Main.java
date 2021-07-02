package odev4;

import java.time.LocalDate;

import Adapters.EDevletServiceAdapters;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer(1, "Güzin", "Turgut", LocalDate.of(1998, 01, 01),"34316134740");
		Game game1 = new Game(1,"GTA",20.0);
		Campaing campaing = new Campaing(1, "Yaza Geçiþ Kampanyasý", 10);
		
		GamerManager gamerManager = new GamerManager(new EDevletServiceAdapters());
	    gamerManager.add(gamer1);
	    gamerManager.delete(gamer1);
	    
	    CampaingManager campaingManager = new CampaingManager();
	    campaingManager.update(campaing);
	    
	    GameManager gameManager = new GameManager();
	    gameManager.delete(game1);
	}

}
