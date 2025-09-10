package com.sk.Java8;

public class TestMethodReferneces1 {
	
	public static void main(String[] args) {
		
		System.out.println("Starting Method reference");
		
		//lambda expression with functional interface.....
		WorkInter1 workInter1 = () ->{
			System.out.println("this is do task new method implementeation ");
		};
		
		workInter1.doTask();
	
		// static method refer...........
		WorkInter1 workInter2 = Stuff1 :: doSuffed; //we are overriding interface method doTask();
		workInter2.doTask();
	
	    Runnable runnable =Stuff1 :: threadTask;
	    Thread thread =new Thread(runnable);
	    thread.start();
	
	   // Instance method reference
	    Stuff1 stuff1=new Stuff1();
	    Runnable runnable2=stuff1 :: printNumber;
	    Thread thread1 =new Thread(runnable2);
	    thread1.start();
	    
	    //constructor reference......
	    System.out.println();
	    System.out.println("Starting constructor reference......");
	    
//	    Provider provider=()->{
//	    	return new Student();
//	    };
//	    Student student=provider.getStudent();
//	    student.display();

	    Provider provider=Student :: new;
	    Student student=provider.getStudent();
	    student.display();
	    
	    
	}
	
	  

}



//class........
class Stuff1{
	
	public static void doSuffed()
	{
		System.out.println("working with different static class Stuff..");
		
	}
	
	public static void threadTask()
	{
		for(int i =1 ;i <=10 ;i ++)
		{
			System.out.println("2 * "+ i +" = " +2 *i  );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void printNumber()
	{
		for(int i =1 ;i <=10 ;i ++)
		{
			System.out.println("5 * "+ i +" = " +5 * i  );
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}



class Student{
	
	public Student() {
		System.out.println("Student Constructor");
	}
	
	public void display()
	{
		System.out.println("I am Student....");
	}
}

// interface........ 
@FunctionalInterface
interface WorkInter1{
	
	public void doTask();
}


@FunctionalInterface
interface Provider {
	
	public Student getStudent();
}