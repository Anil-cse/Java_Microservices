package com.globallogic.Cricket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Cricket Format\n1.ODI\n2.T20\n3.Test");
		int format = s.nextInt();
		if (format >= 4) {
			System.out.println("Invalid Format type");
		}
		System.out.println("Enter the Current Score");
		int score = s.nextInt();

		System.out.println("Enter the Current Over");
		float over = s.nextFloat();
		System.out.println("Enter the Target Score");
		int target = s.nextInt();

		if (format == 1) {
			Match a = new ODIMatch();
			a.setCurrentOver(over);
			a.setCurrentScore(score);
			a.setTargetScore(target);

			int balls = a.calculateBalls();
			double runrate = a.calculateRunrate();
			a.display(runrate, balls);
		} else if (format == 2) {
			Match b = new T20Match();

			b.setCurrentOver(over);
			b.setCurrentScore(score);
			b.setTargetScore(target);

			int balls = b.calculateBalls();
			double runrate = b.calculateRunrate();
			b.display(runrate, balls);
		} else if (format == 3) {
			Match c = new TestMatch();

			c.setCurrentOver(over);
			c.setCurrentScore(score);
			c.setTargetScore(target);

			int balls = c.calculateBalls();
			double runrate = c.calculateRunrate();
			c.display(runrate, balls);
		}

	}

}
