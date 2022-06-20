package com.java.logical;

public class SumOfNumberFromString {

	public static void main(String[] args) {
		String s="34harerama67";
		int sum=0;
		for(int i=0;i< s.length();i++)
		{
			char temp=s.charAt(i);
			if(Character.isDigit(temp))
			{
				System.out.println(temp);
				String s1=String.valueOf(temp);
				
				System.out.println("s1:"+s1);
			  
			}
			
		}
		

	}

}
