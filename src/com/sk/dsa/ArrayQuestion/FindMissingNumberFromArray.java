package com.sk.dsa.ArrayQuestion;

public class FindMissingNumberFromArray {
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static int findMissNumber(int arr[])
	{
		int n=arr.length +1 ;
		int sum= n*(n+1)/2;
		for(int num:arr)
		{
			sum=sum-num;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		int [] arr= {1,3,4,5,6,7,9,2};
		printArray(arr);
		int result=findMissNumber(arr);
		System.out.println("Missing Number "+result);
	}
}
