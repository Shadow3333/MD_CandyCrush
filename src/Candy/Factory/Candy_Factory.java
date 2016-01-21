package Candy.Factory;

import Candy.appli.Game;
import Candy.strategy.Strategy;
import Candy.appli.CandyCrush;

public class Candy_Factory{
	private static Candy_Factory c;
	
	private Candy_Factory(){}
	
	public static Candy_Factory init()
	{
		if (c == null) {
			return new Candy_Factory();
		}
		return c;
	}
	
	public Game Create_Game(Strategy St) {
		return new CandyCrush(St);
	}
}
