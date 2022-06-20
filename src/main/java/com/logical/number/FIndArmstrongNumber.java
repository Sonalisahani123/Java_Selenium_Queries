package com.logical.number;

public class FIndArmstrongNumber {

	public static void main(String[] args) {
		FIndArmstrongNumber.checkArmstrong();

	}
	
	
	public static void checkArmstrong()
	{
		/*sum of cube =number itself
		 * 153,
		 * 
		*/
		
		int number=153;
		//store this number into a temporary variable not to delete
		int temp=number;
		int result=0;
		while(number>0)
		{
			int remainder=number%10;//53
			 result=result+(remainder*remainder*remainder);
			 number=number/10;
		}
		if(result==temp)
		{
			System.out.println("given number armstrong " + result);
		}
		else
		{
			System.out.println("given number is not armstrong " + result);
		}
		
		
	}

}
