package com.java.FunctionalInterface;

import java.util.function.Predicate;

public class serviceP {
	public static void m1(Predicate<String> p, String names[])
	{
		for(String name:names)
		{
			if(p.test(name))
				System.out.println(name);
		}
	}
}