package com.globallogic.Cricket;

public class TestMatch extends Match {

	@Override
	public float calculateRunrate() {
		int run_required=getTargetScore()-getCurrentScore();
		float ball = 90*6-getCurrentOver()*6;
		float run_rate = (run_required/ball)*6;
		return run_rate;
	}

	@Override
	public int calculateBalls() {
		int ball = (int) (90*6-getCurrentOver()*6);
		return ball;
	}

}
