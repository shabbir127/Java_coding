package com.sk;

public class ArrayPracticeSet1 {
	
	public  static void Traversal(int arr[])
	{
		for(int i=0;i < arr.length ;i++)
		{
			System.out.println("Index od array:- "+ i +": "+ arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70};
		Traversal(arr);
	}

}
