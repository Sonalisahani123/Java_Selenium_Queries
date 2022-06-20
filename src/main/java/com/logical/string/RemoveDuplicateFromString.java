package com.logical.string;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateFromString.remove_duplicate("aabbcddeff");

	}
	public static String remove_duplicate(String str)
	{
		//str="aabbcddeff"
		//abcdef
		System.out.println("first string:" + str);
		 String newString="";
		 char[] ch=str.toCharArray();
		 for(char c:ch)
		 {
			 if(newString.indexOf(c)==-1)
				 newString=newString+c; 
		 }
		System.out.println("after removing the duplicate:" + newString );
				 
		return  newString ; 
		
	}

}
