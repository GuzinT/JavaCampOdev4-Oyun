package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamer.getFirstName()=="G�zin" && 
				gamer.getLastName()=="Turgut" && 
				gamer.getDateOfBirth().getYear()==1998 && 
				gamer.getNationalityId()=="34316134740") 
		{
			System.out.println(gamer.getFirstName() + "" + gamer.getLastName() + " isimli oyuncu eklendi.");
		}
		else {
			System.out.println("Ki�i Bulunamamaktad�r.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : " + gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi : " + gamer.getFirstName() + gamer.getLastName());
		
	}

}
