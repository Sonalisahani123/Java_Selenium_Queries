package com.logical.string;

public class CountOccuringCharactersInString {

	public static void main(String[] args) {
		
		CountOccuringCharactersInString.countChar("aabca");
	}
	
	public static void countChar_1()
	{
		String s="sonu sona sonam";
		//count a from string
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='o')
				count++;
		}
		System.out.println("print the number:"+ count);
		
	}
	public static void countChar(String str)
	{
		//str="aabcda"
		char[]ch=str.toCharArray();
		int count=0;
		for(char c:ch)
		{
			if(c=='a')
				//count=count+1;
			count++;
		}
		System.out.println("print number a" +" : "+ count);
	}

}
