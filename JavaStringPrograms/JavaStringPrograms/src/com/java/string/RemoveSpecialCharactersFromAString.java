package com.java.string;

public class RemoveSpecialCharactersFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="!java^?progra><mming*^";
		
		//1-Approach
		String plainString=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainString);
	}

}
