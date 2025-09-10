package com.sk.dsa.ArrayQuestion;

public class moveZeroToEnd {
	
	
	public static void printArray(int [] arr)
	{
		for(int i=0; i< arr.length ;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static void movezero(int [] arr)
	{
		int j=0;
		for(int i=0; i < arr.length;i++)
		{
			if(arr[i] !=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j] != 0)
			{
				j ++;
			}

		}
		printArray(arr);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,34,0,5,6,0,7};
		printArray(arr);
		movezero(arr);
	}

}
