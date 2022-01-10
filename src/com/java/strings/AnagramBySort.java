package com.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramBySort
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*	System.out.println("Enter the String1 : ");
			String str1 = new Scanner(System.in).nextLine();
			
			System.out.println("Enter the String2 : ");
			String str2 = new Scanner(System.in).nextLine();*/
		String str1 = "abcd";
		String str2 = "bcam";
		isAnagram(str1, str2);
	}

	public static void isAnagram(String str1, String str2)
	{
		if (str1.length() != str2.length())
		{
			System.out.println("Not anagrams");
		}
		else
		{
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			String newStr1 = new String(str1Array);
			String newStr2 = new String(str2Array);
			System.out.println(newStr1.equals(newStr2) ? "Its anagram" : "Its not anagram");
		}
	}
}
