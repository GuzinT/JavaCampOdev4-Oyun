package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý kampanya eklenmiþtir");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý kampanya süresi sona ermiþtir.");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý kampanya süresi uzatýlmýþtýr.");
		
	}

}
