package com.sk.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPi {
	

public static void main(String[] args) {
	
	
	
	int [] arr= {1,2,4,6,8,1};


	int sum[]= Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    System.out.println(Arrays.toString(sum));
	
	
    Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);
	
    
    List<String> list=Arrays.asList("apple","banana","cherry");
     Stream<String> myStream=list.stream();
      
     
     //Stream.iterate(0, n->n+1).limit(100).forEach(System.out::println);
     Stream<Integer> limit=Stream.iterate(0, n->n+1).limit(100);
     
    
	

}

}
