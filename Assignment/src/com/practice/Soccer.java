package com.practice;

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer Class";
	}
// add override here
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}