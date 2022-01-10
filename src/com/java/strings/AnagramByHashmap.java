package com.java.strings;

import java.util.HashMap;

public class AnagramByHashmap
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "bcada";
		
		HashMap< Character, Integer> hmap1 = new HashMap<>();
		HashMap< Character, Integer> hmap2 = new HashMap<>();
		
		char [] strArr1 = str1.toCharArray();
		char [] strArr2 = str2.toCharArray();
		
		
		
		/*for (int i = 0; i < strArr1.length; i++)
		{
			 hmap1.put(strArr1[i], 1); 
		}
		for (int i = 0; i < strArr2.length; i++)
		{
			 hmap2.put(strArr2[i], 1); 
		}*/
		
		for (int i = 0; i < strArr1.length; i++) { 
			  
            if (hmap1.get(strArr1[i]) == null) { 
  
                hmap1.put(strArr1[i], 1); 
            } 
            else { 
                Integer c = (int)hmap1.get(strArr1[i]); 
                hmap1.put(strArr1[i], ++c); 
            } 
        } 
  
        // Mapping second String 
        for (int j = 0; j < strArr2.length; j++) { 
  
            if (hmap2.get(strArr2[j]) == null) 
                hmap2.put(strArr2[j], 1); 
            else { 
  
                Integer d = (int)hmap2.get(strArr2[j]); 
                hmap2.put(strArr2[j], ++d); 
            } 
        } 
		
		System.out.println(hmap1.equals(hmap2));   // to check how equals method of hashmap works, hash map equals method checks keys to compare
	}
}
