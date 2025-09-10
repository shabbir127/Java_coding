package com.sk;

import java.util.Scanner;

public class FindSumNProduct {
	public static void main(String[] args) {
		int sum=0,n,prod=1,digit;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number");
			n=sc.nextInt();
		}
		while(n>0)
		{
			digit=n%10;
			if (digit % 2 ==0) {
				sum=sum+digit;
			}else {
				prod=prod*digit;
			}
			n=n/10;
		}
		System.out.println("SUM "+ sum+ " Product " + prod);
		
	}

}
