package com.java.strings;

public class RepeatedCharacters
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "vaibhav";
		System.out.println(str.length());
		char[] charArr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j))
				{
					count++;
				}
			}
			System.out.println("count of "  + str.charAt(i) + " is " + count );
		}

	}

}
