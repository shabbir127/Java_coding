package com.sk.Java8;

public class TestFunctional {
	//main function
	public static void main(String[] args) {
		
		test1 test1= () ->{
			
			System.out.println("Started Functional interface");
		};
		test1.functionalInterface();
		
        test2 test2= (name) ->{
			
			System.out.println("Name :- " + name);
			
		};
		//second example
		test2.functionalInterface1("Shabbir");
		

        test3 test3= (name,number) ->{
			
			System.out.println("Name :- " + name + "Number :- "+ number);
			
		};
		test3.functionalInterface1("Shabbir",1);
	
	
	
	 test4 test4 =(name,age,surname)->{
		 
		 System.out.println("Name :- "+ name +" \nAge:- "+age +" \nSurname :- "+surname);
	 };
	 
	 test4.functionalInterface1("Altaf", 25,"Mulani");
	
	 
       test5 test5 =(name,age,surname)->{
		 
		 System.out.println("Name :- "+ name +" \nAge:- "+age +" \nSurname :- "+surname);
	 };
	 
	 test5.functionalInterface1("Vivek", 24,"jaiswal");
	
	}
	}

	 
	



@FunctionalInterface
interface test1{
	
	
	void functionalInterface();
}

@FunctionalInterface
interface test2{
	
	
	void functionalInterface1(String name);
}

@FunctionalInterface
interface test3{
	
	
	void functionalInterface1(String name, int number);
}

@FunctionalInterface
interface test4{
	
	void functionalInterface1(String name, int number, String surname);
}

@FunctionalInterface
interface test5{
	
	void functionalInterface1(String name, int number, String surname);
}




