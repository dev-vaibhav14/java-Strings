package com.java.strings;

public class Palindrome
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String originalString = "abcdcba";
	//	String reversedString = ReverseString.loopReverse(originalString);
		/*if (originalString.equals(reversedString))
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Its not palindrome");
		}*/
		
	//	System.out.println((originalString.equals(reversedString) ? "Palindrome" : "Not Palindrome"));
		System.out.println(isStringPalindrome(originalString));
	}
	
	
	public static boolean isStringPalindrome(String str)
	{
		char [] word = str.toCharArray();
		boolean flag = true;
		for (int i = 0, j = word.length -1 ; i < word.length; i++, j--)
		{
			if(word[i] != word[j])
				flag = false;
		}
		return flag;
	}
	
}
