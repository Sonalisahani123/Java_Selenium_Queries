package com.logical.string;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacterAndOccurance {

	public static void main(String[] args) {
		FindDuplicateCharacterAndOccurance.duplicateChar("india");
		

	}
	
	public static void  duplicateChar(String str)
	{
		//str="javaj2Eejava"
		//1.convert the string to character Array
		char[]chArray=str.toCharArray();
		//2.create one hashmap to store the character with size after evaluation
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		//3.extract each character from char array
		for(char c:chArray)
		{
			//after getting that char check its present or not in hashmap
			if(hm.containsKey(c))
			{
			//if that char present then increment it by 1
				hm.put(c, hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
		}
		//extract all the character keyset
	   Set<Character>KeySetChar=hm.keySet();
//	   //extract each key
//	   for(char c1:KeySetChar)
//	   {
//		 if(hm.get(c1)>1)
//		 {
//			 System.out.println(c1 + " : " +hm.get(c1));
//		 }
//	   }
//	}
	   
	System.out.println(hm);   
	   
	   
	   
}
}
