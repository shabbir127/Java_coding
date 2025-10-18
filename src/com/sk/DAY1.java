package com.sk;

import java.util.Scanner;


public class DAY1 {


	    static Scanner sc = new Scanner(System.in);

	    // Traversal
	    public static void Traversal(int[] arr) {
	        System.out.println("Array contents:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("Index " + i + ": " + arr[i]);
	        }
	    }

	    // Insert elements
	    public static int[] Insert() {
	        System.out.print("Enter the length of the array: ");
	        int n = sc.nextInt();
	        if (n <= 0) {
	            System.out.println("Invalid length!");
	            return new int[0];
	        }

	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            arr[i] = sc.nextInt();
	        }
	        return arr;
	    }

	    // Deletion
	    public static int[] Deletion(int position, int[] arr) {
	        if (position < 0 || position >= arr.length) {
	            System.out.println("Invalid position!");
	            return arr;
	        }

	        for (int i = position; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        // Create new array of smaller size
	        int[] afterRemoval = new int[arr.length - 1];
	        for (int i = 0; i < afterRemoval.length; i++) {
	            afterRemoval[i] = arr[i];
	        }
	        return afterRemoval;
	    }

	    // Minimum
	    public static void MinimumArray(int[] arr) {
	        if (arr.length == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) min = arr[i];
	        }
	        System.out.println("Minimum of array: " + min);
	    }

	    // Maximum
	    public static void MaximumArray(int[] arr) {
	        if (arr.length == 0) {
	            System.out.println("Array is empty!");
	            return;
	        }
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) max = arr[i];
	        }
	        System.out.println("Maximum of array: " + max);
	    }

	    // Reverse using two-pointer approach
	    public static void reverseArray(int[] arr) {
	        int start = 0, end = arr.length - 1;
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	        System.out.println("Array reversed successfully!");
	    }

	    // Main menu
	    public static void main(String[] args) {
	        int[] arr = {};
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\n--- Array Operations Menu ---");
	            System.out.println("1. Insert Array");
	            System.out.println("2. Traverse Array");
	            System.out.println("3. Delete Element by Index");
	            System.out.println("4. Find Minimum");
	            System.out.println("5. Find Maximum");
	            System.out.println("6. Reverse Array");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    arr = Insert();
	                    break;
	                case 2:
	                    Traversal(arr);
	                    break;
	                case 3:
	                    System.out.print("Enter index to delete: ");
	                    int pos = sc.nextInt();
	                    arr = Deletion(pos, arr);
	                    break;
	                case 4:
	                    MinimumArray(arr);
	                    break;
	                case 5:
	                    MaximumArray(arr);
	                    break;
	                case 6:
	                    reverseArray(arr);
	                    break;
	                case 7:
	                    exit = true;
	                    System.out.println("Exiting program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}


