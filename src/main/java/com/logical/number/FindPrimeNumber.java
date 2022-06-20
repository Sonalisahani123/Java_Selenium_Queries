package com.logical.number;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		FindPrimeNumber.findPrime();
	}
	
	public static void findPrime()
	{
		int number=-2,count=0;
		//1,2,3,4,5
		
		/* prime number which is divisible by 1 and itself
		 * 1.take a loop and start from 1 to till that number because it needs to divisible by 1 and itself
		 *2.inside for loop check the condition the modular division or remainder 0 or not
		 *if its 0 then increase one count variable
		 *if count is only 2 then its prime number
		 */
		
		for(int i=1;i<=number;i++)
		{
			//2.check the divisible
			if(number % i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
			
		
		
		
	}

}
