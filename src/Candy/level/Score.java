package Candy.level;

import java.util.TreeMap;

public class Score {
	
	private TreeMap<Integer, Difficults> times ;
	
	public Score(){
		this.times = new TreeMap<Integer, Difficults>();
	}

	public TreeMap<Integer, Difficults> getTimes() {
		if (times.isEmpty()) {
			return null;
		}
		return times;
	}
	
	public void addMap(Integer time, Difficults difficult)
	{
		times.put(time, difficult);
	}
	
	public TreeMap<Integer, Difficults> getMap()
	{
		return times;
	}
	
	

}
