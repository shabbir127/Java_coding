package com.sk.dsa.ArrayQuestion;

public class resizeArray {
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static void resize(int [] arr, int capcity)
	{
		int [] temp=new int[capcity];
		
	     printArray(temp);
		for(int i=0;i < arr.length; i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
		printArray(arr);
	}
	
	public static void main(String[] args) {
		int arr[]= {5,3,9,10};
		printArray(arr);
		resize(arr, arr.length*2);
		printArray(arr);
		
	}

}
