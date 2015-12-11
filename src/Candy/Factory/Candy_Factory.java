package Candy.Factory;

import Candy.appli.Game;
import Candy.appli.CandyCrush;

public class Candy_Factory implements IFactory{

	public Game Create_Game() {
		return new CandyCrush();
	}
}
