package com.sk;


import java.util.Iterator;
import java.util.Scanner;


//traversing the array
public class ArrayPracticeSet1 {
	
	 static Scanner sc=new Scanner(System.in);
	public  static void Traversal(int arr[])
	{
		for(int i=0;i < arr.length ;i++)
		{
			System.out.println("Index od array:- "+ i +": "+ arr[i]);
		}
		
	}
	
	//Insert in array
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
		
		//Linear search
		public static void LinearSearch(int arr[])
		{
			int target=7330;
			for(int i=0; i < arr.length; i++)
			{
				if(target == arr[i])
				{
					System.out.println("Linear Search success: - " + arr[i]);
				    return ;
				}
			}
			System.out.println("Linear Search Failed : -" );
		}
		
		//Frequency of array
		public static void Frequency(int[] arr)
		{
			int count=0;
			int frequncy=40;
			for(int i=0;i<arr.length;i++)
			{
				if (frequncy==arr[i]) {
					count ++;
				}
			}
			System.out.println("Total Number of frequnecy is:- "+ count);
		}
		
		//checking the array is sorted or not
		public static void ArrayChecking(int[] arr)
		{
			boolean flag=true;
			for(int i=0;i < arr.length -1 ;i++)
			{
				if(arr[i] < arr[i + 1])
				{
					System.out.println("Array is not sorted...");
					flag=false;
					break;
				}
			}
			if (flag) {
				System.out.println("Array is sorted...");	
			}
			
		}
	
		
		//count the frequency of each element
		public static void EachFrequency(int[] arr)
		{
			boolean[] frequency=new boolean[arr.length];
			int count=0;
			for(int i=0;i < arr.length ;i++)
			{
				if (frequency[i]) {
					continue;
				}
				count=1;
				for(int j=i+1;j< arr.length ;j++)
				{
					if (arr[i]==arr[j])
					{
						frequency[j]=true;
						count++;
						
					}
					//System.out.println("frequency: -"+frequency[j]);
				}
				System.out.println("Elemeny: - " +arr[i] + " Total Frequency: - " +count);
			}	
		}
		
		//second max value;
		public static void SecondMaxElement(int[] arr)
		{
			int max=Integer.MIN_VALUE;
			int secondMax=Integer.MIN_VALUE;
			
			for(int i=0; i < arr.length ;i++)
			{
				if(arr[i] > max)
				{
					secondMax=max;
					max=arr[i];
				}
				if (arr[i] > secondMax && max != arr[i]) {
					secondMax=arr[i];
				}
			}
			System.out.println("Second Max value is:- "+secondMax);
			
		}
	
		//remove duplicate
		public static int removeDuplicates(int[] arr) {
		    int i = 0;
		    for (int j = 1; j < arr.length; j++) {
		        if (arr[i] != arr[j]) {
		            i++;
		            arr[i] = arr[j];
		        }
		    }
		    return i + 1; // new length
		}
		
		//We need to find if there exists a pair (two numbers) in the array whose sum equals the target.
	    public static void pairElement(int[] arr)
	    {
	    	int start=0;
	    	int end =arr.length-1;
	    	int target=11;
	    	boolean flag=false;
	    	while(start < end)
	    	{
	    		int sum=arr[start]+arr[end];
	    		if (target == sum) 
	    		{
					System.out.println("we got the sum in the given array:- "+ sum +" target was "+ target);
					flag=true;
					break;
				}else if (target > sum) {
					start ++;
				}else {
					end--;
				}	
	    	}
	    	if (!flag) {
	    		System.out.println("we have not got the sum in the given array :");
			}
	    }
	    
	    //bubble sort algothrim 
	    public static void BubbleSort(int[] arr)
	    {
	    	for(int i = 0 ; i< arr.length ; i++)
	    	{
	    		int flag=0;
	    		for(int j =0; j< arr.length-1-i;j++)
	    		{
	    			if (arr[j] > arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=1;
					}
	    		}
	    		if (flag ==0) {
					break;
				}
	    	}
	    	
	    	for(int i=0;i<arr.length ;i++)
	    	{
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	    
	    
	public static void main(String[] args) {
		//int n;
		//int arr[]= {10,9,20,30,40,50,60};
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr1[] = {9,4,3,7,6,9,8,11};
	//Traversal(arr);
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
		
		//SumNAverage(arr);
		//BinarySearch(arr);
		//LinearSearch(arr);
		//Frequency(arr);
	//	ArrayChecking(arr);
		//EachFrequency(arr);
		//SecondMaxElement(arr);
		//pairElement(arr);
		
		BubbleSort(arr1);
		
	}
	


}
