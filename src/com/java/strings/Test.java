package com.java.strings;


public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	String str = "vaibhav";
	
    recursiveReverse(str);
	
	
	}
	
	public static void recursiveReverse(String str)
	{
		System.out.println(str.charAt(str.length()-1));
		str = str.substring(0, str.length()-1);
		recursiveReverse(str);
	}

}