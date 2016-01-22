package Candy.strategy;

import Candy.level.Difficults;

public class LevelHardStrategy implements Strategy {

	final int multiplicateur = 1;
	
	public int getmultiplicateur() {
		return multiplicateur;
	}

	public Difficults getDifficult() {
		return Difficults.hard;
	}

}
