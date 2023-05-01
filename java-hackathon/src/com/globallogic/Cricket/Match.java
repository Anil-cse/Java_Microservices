package com.globallogic.Cricket;

public abstract class Match {

	private int currentScore;
	private float currentOver;
	private int targetScore;
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	
	public abstract float calculateRunrate();
	public abstract int calculateBalls();
	
	void display(double reqRunRate,int balls)
	{
		System.out.println("Requirements:Need "+(targetScore-currentScore)+" in "+balls+" balls");
		System.out.println("Required Run Rate-"+String.format("%.2f", reqRunRate));
	}
	
}
