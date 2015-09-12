package com.testcases;

public class TC_001 {

   final int i=100;
   int j=9;
	
   public void hello()
   {
	  System.out.println("HELLO WORLD");   
   }
   
   public void sum(int a, int b)
   {
	   int c=a+b;
	   System.out.println(c);
   }
   
   public int sub(int a, int b)
   {
	   int c=a-b;
	   return c;
   }
   
   
   public TC_001(int a)
   {
	   System.out.println(a);
	   System.out.println("This is Constructor");
   }

}
