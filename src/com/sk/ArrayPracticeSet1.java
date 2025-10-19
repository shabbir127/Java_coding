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
	
	public static void Deletion(int position,int arr[])
	{
		if (position < 0 || position >= arr.length) {
	        System.out.println("Invalid position");
	        return;
	    }
		
		for(int i=position ;i < arr.length -1 ;i++)
		{
			arr[i]=arr[i + 1];
		}
		
		//Once Array is created you cannot change his size so we have created new smaller array;
		int afterremoval[]=new int[arr.length-1];
		for(int i=0 ; i < arr.length-1;i++)
		{
		  afterremoval[i]=arr[i];	
		}
		
		Traversal(afterremoval);
	}
	
	//Minimum of array
	public static void MinimumArray(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
				{
				   min=arr[i];
				}
		}
		System.out.println("Minimum of array: - "+ min);
	}
	
	//Maximum of array
		public static void MaximumArray(int[] arr)
		{
			int max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] > max)
					{
					   max=arr[i];
					}
			}
			System.out.println("Maximum of array: - "+ max);
		}
	
		//Array reverse ...
		public static void reverseArray(int arr[])
		{
			for(int i=arr.length-1 ; i >= 0;i--)
			{
				System.out.print(arr[i]+ " ");
			}
			
			System.out.println();
			for(int i=0;i< arr.length;i++)
			{
				System.out.print(arr[arr.length - 1 -i] + " ");;
			}
			
			System.out.println();
			int start=0;
			int end=arr.length-1;
			while(start < end)
			{
				int temp= arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start ++;
				end --;
			}
			Traversal(arr);
		}
		
		
		
		//Sum and Average ....
		public static void SumNAverage(int[] arr)
		{
			int sum=0;
			int sum1=0;
			for(int num:arr)
			{
				sum=sum+num;
			}
			int i=0;
			while(arr.length > i)
			{
				sum1 += arr[i];
				i++;
			}
			
			
			double avg =sum/arr.length;
			double avg1 =sum1/arr.length;
			
			System.out.println("Sum of array is:- " + sum + ", Average of given Array is :- " + avg );
			System.out.println("Sum of array is:- " + sum1 + ", Average of given Array is :- " + avg1 );
		}
		
		//Binary Search
		public static boolean BinarySearch(int[] arr)
		{
			int start =0;
			int target=70;
			int end=arr.length-1;
			boolean found=false;
			while(start <= end)
			{
				int mid =(start+end)/2;
				if (target == arr[mid]) {
					System.out.println("Array found:- " + arr[mid] + ", poistion is :- " + mid);
					found =true;
					return found;
				}else if (target > arr[mid]) {
				start = mid +1;
				}else {
					end = mid -1;
				}
			
			}
			if (!found) {
				System.out.println("Array Not found:");
			}
			
			return false;
			
		}
		
		
		
	
	
	public static void main(String[] args) {
		//int n;
		int arr[]= {10,20,30,40,90,50,60};
		Traversal(arr);
//		System.out.print("Please Enter the Length:-");
//	     n=sc.nextInt();
//		Insert(n);
//		System.out.println("Please Enter the Delete position: -");
//		n=sc.nextInt();
//		Deletion(n, arr);
		
//		System.out.println("Finding Minimum of array ");
//		MinimumArray(arr);
		
//		System.out.println("Finding Maximum of array ");
//		MaximumArray(arr);
		
//		reverseArray(arr);
		
		SumNAverage(arr);
		BinarySearch(arr);
		
	}
	


}
