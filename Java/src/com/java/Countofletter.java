package com.java;

public class Countofletter {
	public static void main(String[] args) {
		String s = "EsWarI@123_GMail.com5";
		int small = 0;
		int caps = 0;
		int special = 0;
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				small++;
			} else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				caps++;
			} else if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
				num++;
			} else {
				special++;
			}
		}
		System.out.println("count of small : " + small);
		System.out.println("count of caps : " + caps);
		System.out.println("count of number : " + num);
		System.out.println("count of special : " + special);
	}
}
