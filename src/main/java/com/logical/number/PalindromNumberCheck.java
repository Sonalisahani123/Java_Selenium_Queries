package com.logical.number;

public class PalindromNumberCheck {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
		  int n=121;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;  
		   System.out.println("sum:"+ sum);
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		 


	}


