package Candy.level;

import candy.strategy.Strategy;

public class Level {
	
	private int levelMax;
	private int level;
	private int dislockLevel;
	private Strategy strategy;
	
	
	public int getLevelMax() {
		return levelMax;
	}
	public void setLevelMax(int levelMax) {
		this.levelMax = levelMax;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getDislockLevel() {
		return dislockLevel;
	}
	public void setDislockLevel(int dislockLevel) {
		this.dislockLevel = dislockLevel;
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void updateMaxLevel(int newLevel){
		if (this.levelMax < newLevel){
			this.setLevelMax(newLevel);
		}
	}

}
