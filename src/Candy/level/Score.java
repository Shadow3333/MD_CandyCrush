package Candy.level;

import java.util.TreeSet;

public class Score {
	
	private TreeSet<Integer> times ;
	
	public Score(){
		this.times = new TreeSet<Integer>();
	}

	public TreeSet<Integer> getTimes() {
		if (times.isEmpty()) {
			return null;
		}
		return times;
	}
	
	public void addTime(Integer time)
	{
		times.add(time);
	}

}
