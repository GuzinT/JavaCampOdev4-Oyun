package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}

}
