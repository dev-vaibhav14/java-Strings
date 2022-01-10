package com.java.strings;

public class ReverseString
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "vaibhav";
		//recursiveReverse(str);
		//System.out.println(withStringBuilder(str));
		withSplit(str);
	}
	
	public static void recursiveReverse(String str)
	{
		System.out.println(str.charAt(str.length() - 1 ));
		str = str.substring(0, str.length() - 1);
		recursiveReverse(str);
	}
	
	public static String loopReverse(String str)
	{
		char [] reversed = new char[str.length()];
		for (int i = str.length(), j = 0; i > 0; i--,j++)
		{ 
			reversed[j] = str.charAt(i-1);
		}
		String reversedString = new String(reversed);
		return reversedString;
	}
	
	public static String withStringBuilder(String str)
	{
		String reversedString = null;
		StringBuilder sb = new StringBuilder(str);
		reversedString =  sb.reverse().toString();
		return reversedString;
	}
	
	public static void withSplit(String str)
	{
		String reversedString = "" ;
		String [] reversed = str.split("");
		for (int i = reversed.length -1; i >= 0; i--)
		{
			reversedString = reversedString + reversed[i];
		}
		
		System.out.println(reversedString);
	}
	
}
