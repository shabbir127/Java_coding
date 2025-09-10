package com.sk.dsa.ArrayQuestion;

public class FindMinimumArray {
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int FindMinimumValue(int [] arr) {
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (arr[i] < min) {
				min=arr[i];
			}
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {
		int [] arr= {2,4,5,6,7,8,1,7};
		
		printArray(arr);
		int result=FindMinimumValue(arr);
		System.out.println("Minimum Value = "+ result);
	}

}
