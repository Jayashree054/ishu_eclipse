package com.java;

public class Array1 {
public static void main(String[] args) {
	int[][]a= {{1,2,3},{4,5,6} };
	int[][]b= {{2,2,3},{5,2,8} };
	int[][]sum=new int[2][3];
	int r1,c1;
	
	for(r1=0;r1<a.length;r1++)
	{
		for(c1=0;c1<b.length;c1++) {
			sum[r1][c1]=a[r1][c1]+b[r1][c1];
		}
		
		}
	System.out.println("Sum of these two Arrays are:");
	for(r1=0;r1<a.length;r1++) {
		for(c1=0;c1<a[0].length;c1++) {
			System.out.format("%d\t", sum[r1][c1]);
		}
		System.out.println("");
		
	}
	
		}
		
			
	
	
	
}
