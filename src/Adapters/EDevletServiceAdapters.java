package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class EDevletServiceAdapters implements GamerCheckService{

	@Override
	public boolean validate(Gamer gamer) {
		System.out.println("E Devlet sisteminde ki�i mevcuttur");
		return false;
	}

}
