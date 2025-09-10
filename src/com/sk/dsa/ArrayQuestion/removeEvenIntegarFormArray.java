package com.sk.dsa.ArrayQuestion;

import java.util.Iterator;

public class removeEvenIntegarFormArray {
	
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int [] removeEven(int [] arr)
	{
		int oddCount=0;
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i] % 2 != 0) {
				oddCount ++;
			}
		}
		
		int [] result=new int[oddCount];
		int idx=0;
		for(int i=0; i < arr.length ;i++)
		{
			if (arr[i] % 2 != 0) {
				result[idx]=arr[i];
				idx ++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int [] arr= {1,6,3,5,7,9,2,7};
		printArray(arr);
		System.out.println("-----------------------------------------------------------------------------------------------------");
//		int [] result=removeEven(arr);
//		printArray(result);
		printArray(removeEven(arr));
	}
}


 