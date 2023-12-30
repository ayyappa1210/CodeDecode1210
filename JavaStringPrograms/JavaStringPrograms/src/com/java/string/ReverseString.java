package com.java.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ayyappa";
		
		char[] charArray=s.toCharArray();
		
		//1-Approach
		int length=s.length();
		for (int i = length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//2-Approach
		for (int i = length-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//3-Approach
		StringBuffer sb = new StringBuffer(s);
		System.out.print(sb.reverse());
		
		System.out.println();
		
		//4-Approach
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1.reverse());
	}

}
