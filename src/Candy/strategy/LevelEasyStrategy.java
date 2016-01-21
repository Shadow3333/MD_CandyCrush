package Candy.strategy;

public class LevelEasyStrategy implements Strategy{

	int multiplicateur;

	public LevelEasyStrategy() {
		multiplicateur = 5;
	}
	
	public int getmultiplicateur() {
		return multiplicateur;
	}

}
