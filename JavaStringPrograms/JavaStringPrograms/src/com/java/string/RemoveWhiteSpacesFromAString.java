package com.java.string;

public class RemoveWhiteSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " j A V A ";
		String plainString=s.replaceAll("\\s", "");
		System.out.println(plainString);
	}

}
