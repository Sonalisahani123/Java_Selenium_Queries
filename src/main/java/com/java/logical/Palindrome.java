package com.java.logical;

public class Palindrome {

	public static void main(String[] args) {
		String s="nitin";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
         reverse=reverse+ s.charAt(i);
         //System.out.println("Reverse:"+reverse);
        }
   
        if(s.equals(reverse))
        {
        System.out.println("given String is palindrome:"+ reverse);
        }
        }
     
   

	}


