package com.java.logical;

public class ReverseWordAndLetterString {

	public static void main(String[] args) {
		//ReverseWordAndLetterString.reverse_Word();
		
		//ReverseWordAndLetterString.reverse_letter();
		
		ReverseWordAndLetterString.reverseLetterWithWord();
		
	}

	public static void reverse_Word() {

		String s = "I Love Java";
		String[] a = s.split(" ");
		String reverse = "";
		// System.out.print("a:"+a);

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);

		}

		for (int i = a.length - 1; i >= 0; i--) {
			// System.out.println(a[i] +" ");

			reverse = reverse + a[i] + " ";

		}
		System.out.println("reverse:" + reverse);

	}
	
	
	public static void reverse_letter()
	{
		/*Input:My name sonali
		Output:ym eman ilanos*/
		
		String str="My name sonali";
		String[]sa=str.split(" ");//[My,name,sonali]
		String  reverse="";
		String final_rev="";
		for(int i=0;i<sa.length;i++)
		{
			String word=sa[i];//My
			//System.out.println("Print the first for loop:"+ sa[i]);
			String reverseWord="";
		
		
		for(int j=word.length()-1;j>=0;j--)//ym
		{
			reverseWord= reverseWord + word.charAt(j);
			 
			 
			 //System.out.println("print the secone for loop:" + word.charAt(j));
		
		}
		
		final_rev=final_rev +reverseWord + " ";
		}
		
		System.out.println("final reverse:" +final_rev );
	}
	
	
	public static void reverseLetterWithWord()
	{
		/*Input:sonu sahani
		Output:inahas unos*/
		
		
		String s="sonu sahani";
		String reverse="";
		String [] sa=s.split(" ");//[sonu,sahani]
		  for(int i=sa.length-1;i>=0;i--)
		  {
			  //System.out.println(sa[i]);//sahani,sonu
			  String rword=sa[i];
			  //System.out.println(sa[i]);//sahani,sonu
			  String rev="";
			  System.out.println("first loop rev:"+rev);
			  for(int j=rword.length()-1;j>=0;j--)
			  {
				  
				 rev=rev + rword.charAt(j); 
				 System.out.println("second loop rev:" + rev);
				 
				  
			  }
			  
			   reverse=reverse + rev + " ";
			   
			
		  }
		  System.out.println("reverse: "+reverse);
		
		
		
		
	}
	
	
	}


