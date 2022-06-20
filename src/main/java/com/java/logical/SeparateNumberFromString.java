package com.java.logical;

public class SeparateNumberFromString {

	public static void main(String[] args) {
		String s="123Bangalore";
		
		
		for(int i=0;i < s.length();i++)
		{
			char temp=s.charAt(i);
			//System.out.println("temp:"+temp);
			if(Character.isDigit(temp))
			{
				
			System.out.println("temp2:"+temp);
			
			}
		}
		
	
	  

	}

}
