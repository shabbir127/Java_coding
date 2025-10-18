package com.sk;

import java.util.Scanner;

public class ArrayPracticeSet1 {
	
	 static Scanner sc=new Scanner(System.in);
	public  static void Traversal(int arr[])
	{
		for(int i=0;i < arr.length ;i++)
		{
			System.out.println("Index od array:- "+ i +": "+ arr[i]);
		}
		
	}
	
	public static void Insert(int n)
	{
		if (n <= 0) {
			System.out.println("invalid length :");
			return ;
		}
		System.out.println("Given the Length of Array:- "+ n);
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the value of array index "+ i + " ");
     		arr[i]=sc.nextInt();
		}
		
		Traversal(arr);
	}
	
	
	public static void main(String[] args) {
		int n;
		int arr[]= {10,20,30,40,50,60,70};
		Traversal(arr);
		System.out.print("Please Enter the Length:-");
	     n=sc.nextInt();
		Insert(n);
		
	}
	


}
