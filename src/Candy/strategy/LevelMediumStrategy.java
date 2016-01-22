package Candy.strategy;

import Candy.level.Difficults;

public class LevelMediumStrategy implements Strategy{

	final int multiplicateur = 3;

	public int getmultiplicateur() {
		return multiplicateur;
	}

	public Difficults getDifficult() {
		return Difficults.normal;
	}

}
