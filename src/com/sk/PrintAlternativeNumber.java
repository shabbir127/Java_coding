package com.sk;

import java.util.stream.IntStream;

public class PrintAlternativeNumber {

	public static void main(String[] args) {
		
		int [] ary= {1,2,3,4,5,6,7,8,9,10};
		
		IntStream.range(0,ary.length).filter(i->i%2==0).map(i->ary[i]).forEach(System.out::println);
		
		System.out.println("Hi\nHello\nBye\n");
		
	}
}
