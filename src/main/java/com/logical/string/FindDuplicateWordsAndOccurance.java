package com.logical.string;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWordsAndOccurance {

	public static void main(String[] args) {
		FindDuplicateWordsAndOccurance.findDuplicate("java sonu java sonu abc def abc sonu");	

	}
	
public static void findDuplicate(String str)
{
	//split the string to word array
	//split() will take the space and divide it into indivisual word from string
	String[] words=str.split(" ");
	
	//create one Hashmap to store the duplicate word and occurance in key value pair
	HashMap<String,Integer> wordCounts=new HashMap<String,Integer>();
	//extract each word from words array
     for(String word: words)
     {
    	 // check that perticular word present in hashmap or not
    	 if(wordCounts.containsKey(word))
    	 {
    		 //if you found that perticular word present then it will increase the value by 1
    		 wordCounts.put(word,wordCounts.get(word)+1 );
    	 }else
    	 {
    		 //if its not present then put the word count 1 for first time
    		 wordCounts.put(word, 1);
    	 }
     }
	
	//Extracting all keys from map
    Set<String> extractWords=wordCounts.keySet();
    
	//extract each word from keyset
    for(String wordInset:extractWords)
    {
    	if(wordCounts.get(wordInset)>1)
    	{
    		System.out.println(wordInset +":" + wordCounts.get(wordInset));
    	}
    }
}

}
