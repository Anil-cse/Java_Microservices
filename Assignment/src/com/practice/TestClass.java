package com.practice;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		int out_ = Memory(N, A, B, C);
		System.out.println(out_);
		wr.close();
		br.close();
	}

	static int Memory(int N, int A, int B, int C) {
// Write your code here
		int result = 0;
		int a[] = new int[3];
		a[0]=A;
		a[1]=B;
		a[2]=C;
		if(A==N)
		{
			result=1;
		}
		if(B==N)
		{
			result=1;
		}
		if(C==N)
		{
			result=1;
		}
		if(A+B==N)
		{
			result=2;
		}
		if(B+C==N)
		{
			result=2;
		}
		if(A+C==N)
		{
			result=2;
		}
		if(A+B+C==N)
		{
			result=3;
		}
		return result;
	}
}