package Candy.Factory;

import Candy.appli.Game;
import Candy.appli.CandyCrush;

public class Candy_Factory implements IFactory{
	private IFactory c;
	
	private Candy_Factory(){}
	
	public IFactory init()
	{
		if (c == null) {
			return new Candy_Factory();
		}
		return c;
	}
	
	public Game Create_Game() {
		return new CandyCrush();
	}
}
