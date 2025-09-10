package com.sk.Java8;

public class TestMethodReferences {

	public static void main(String[] args) {
		
		System.out.println("Lets Begin bro............");
		Workinter workinter=()->{System.out.println("do task");};
		workinter.doTask();
		
		Workinter workinter2=Stuff :: doStuff;
		workinter2.doTask();
		
		Runnable runnable=Stuff::threadTask;
		Thread d=new Thread(runnable);
		d.start();
		
		Workinter workinter3=Stuff::secondMethod;
		workinter3.doTask();
		
		
		 
	}
}



class Stuff
{
	public  static void doStuff()
	{
		System.out.println("Dostuff static method");
		System.out.println("second sysout");
		String name="Shabbir";
		System.out.println("Name " + name);
	}
	
	public static void threadTask()
	{
		for(int i=1;i<=10 ;i++)
		{
			System.out.println(i*2);
			
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		}
	}
	
	
	public static void secondMethod()
	{
		System.out.println("Second method is  ready......");
	}
}

@FunctionalInterface
interface Workinter{
	
	public void doTask();
}