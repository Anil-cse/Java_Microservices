package com.practice;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++)
			if (a % i == 0)
				return false;
		return true;
	}

public static PerformOperation isOdd(){
//write your code
	return x -> x%2!=0;
		
}

	public static PerformOperation isPrime() {
//write your code
		return number -> IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
	}

	public static PerformOperation isPalindrome() {
//write your code
		return number -> number == IntStream.iterate(number, i -> i/10).map(n -> n%10)
				.limit(String.valueOf(number).length()).reduce(0,(a,b) -> a = a*10+b);
	}
}