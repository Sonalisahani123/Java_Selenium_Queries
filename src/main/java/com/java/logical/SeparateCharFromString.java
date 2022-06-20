package com.java.logical;

public class SeparateCharFromString {

	public static void main(String[] args) {
		
		 /*Input:"I#ndi#₹&a"
			 OutPut:"India"
	*/
		 /* String s="I#ndi#₹&a";
		  s=s.replaceAll("[^a-zA-Z]", "");
		 System.out.println(s);*/
		 
		// SeparateCharFromString.separate_Ch_digit_symbol();
		
		SeparateCharFromString.separate_Ch();
	
	}
	
	public static void separate_Ch_digit_symbol()
	{
		 String s="12sona3l#$!@i";
		 String letter="";
		 String number="";
		 String symbol="";
		 for(int i=0; i<s.length();i++)
		 {
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				number=number+c;
				 //System.out.println("number");
				
				
			}else if(Character.isLetter(c))
			{
				letter=letter+c;
			}else
			{
				symbol=symbol+c;
			}
			
		 }
		 System.out.println("["+number +"]");
		 System.out.println("["+letter+"]");
		 System.out.println("["+symbol+"]");
		 }
	
	public static void separate_Ch()
	{
		
		String a="abc-2021";
		 //char[]ch=a.toCharArray();
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(a);
		 for(int i=0;i<a.length();i++)
		 {
			 
		 }
		
	}
		  
		
		
	}


