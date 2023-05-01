package com.practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
/*
* Complete the 'rotLeft' function below.
*
* The function is expected to return an INTEGER_ARRAY.
* The function accepts following parameters:
* 1. INTEGER_ARRAY a
* 2. INTEGER d
*/
public static List<Integer> rotLeft(List<Integer> a, int d) {
// Write your code here
	int[] array = new int[a.size()];
	for(int j = 0; j<=array.length-1; j++)
	{
		array[j]=a.get(j);
	}
	for(int i = 1; i<=d; i++)
	{
		int temp = array[0];
		for(int j = 0; j<array.length-1; j++)
		{
			array[j]=array[j+1];
		}
		array[array.length-1]=temp;
	}
	List<Integer> resultList = new ArrayList<>();
	for(int j = 0; j<=array.length-1; j++)
	{
		resultList.add(array[j]);
	}
	System.out.println("Result is");
	resultList.forEach(System.out::println);
	return resultList;
}
public static void main(String[] args)
{
	int n,d;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	d=sc.nextInt();
	List<Integer> a = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		int aItem = sc.nextInt();
		a.add(aItem);
	}
	Result.rotLeft(a, d);
	
}
}