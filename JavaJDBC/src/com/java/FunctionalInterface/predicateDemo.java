package com.java.FunctionalInterface;

import java.util.function.Predicate;

public class predicateDemo{

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = num->num>18;
		Predicate<String> p2 = name->name.length()>5;
		
		System.out.println(p1.test(25));
		System.out.println(p2.test("kumar"));
		
	}

}
