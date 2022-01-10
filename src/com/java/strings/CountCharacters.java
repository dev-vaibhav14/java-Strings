package com.java.strings;

import java.util.HashMap;

public class CountCharacters
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String str = "vaibhav";
		HashMap<Character, Integer> charCounts = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			charCounts.computeIfPresent(c, (character, count) -> count + 1);
			charCounts.computeIfAbsent(c, (character) -> 1);
		}
		System.out.println(charCounts);
	}

}
