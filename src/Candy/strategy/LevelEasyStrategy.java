package Candy.strategy;

import Candy.level.Difficults;

public class LevelEasyStrategy implements Strategy{

	final int multiplicateur = 5;
	
	public int getmultiplicateur() {
		return multiplicateur;
	}

	public Difficults getDifficult() {
		return Difficults.easy;
	}

}
