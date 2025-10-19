package com.sk;

public class DAY2 {

	//reverse Array..
	public static void reverseArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i< arr.length ;i++)
		{
			arr[i]=n-1-i;
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
