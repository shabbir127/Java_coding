package com.sk.dsa.ArrayQuestion;

public class PalindromeString {
	
	public static boolean isPalindromeString(String word)
	{
		char CharArray[]=word.toCharArray();
		int start=0;
		int end =word.length()-1;
		while(start <  end)
		{
			if(CharArray[start] != CharArray[end])
			{
				return false;
			}
			start ++;
			end --;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String word="String";
		boolean result= isPalindromeString(word);
		if (result) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}
		
	}

}
