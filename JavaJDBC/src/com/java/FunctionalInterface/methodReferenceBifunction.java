package com.java.FunctionalInterface;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiFunction;
class Calculation
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static double add(int a,double b)
	{
		return a+b;
	}
	
	public  double add(double a,double b)
	{
		return a+b;
	}
	
	
}
public class methodReferenceBifunction {
	public static void main(String[] args) throws IOException {
		BiFunction<Integer, Integer, Integer> f1 = Calculation::add;
		BiFunction<Integer, Double, Double> f2 = Calculation::add;
		//BiFunction<Double, Double, Double> f3 = Calculation::add;
		System.out.println(f1.apply(2, 2));
		System.out.println(f2.apply(2, 2.45));
	//	System.out.println(f2.apply(2.30, 2.67));
		
		Calculation cal = new Calculation();
		BiFunction<Double, Double, Double> f4 = cal::add;
		System.out.println(f4.apply(2.45, 2.30));
		
		
	}
}