package com.java.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";

		// 1-Approach
		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// 2-Approach
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = s.indexOf(c, i + 1);
			if (index == -1) {
				sb2.append(c);
			}
		}
		System.out.println(sb2);

		// 3-Approach
		char[] charArray = s.toCharArray();
		StringBuilder sb3= new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(charArray[i]);
			}
		}
		System.out.println(sb3);
		
		//4-approach
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}
		for (Character character : set) {
			sb4.append(character);
		}
		System.out.println(sb4);
	}
}
