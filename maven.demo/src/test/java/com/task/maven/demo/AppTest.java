package com.task.maven.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

public class AppTest 
{
   
    @Test
    public void program()
    {
    	Scanner sc=new Scanner(System.in);
		App hi=new App();
		int choice;
		float pa,time,rate,number,simpleinterest;
		double compoundinterest;
			System.out.println("-----------------------------------");
			System.out.println("1.Calculating Simple Interest");
			System.out.println("2.Calculating Compound Interest");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:System.out.println("Enter Principal,Time and Rate");
					   pa=sc.nextFloat();
					   time=sc.nextFloat();
					   rate=sc.nextFloat();
					   simpleinterest=hi.SimpleInterest(pa,time,rate);
					   System.out.println("Simple Interest is:"+simpleinterest);
					   break;
				case 2:System.out.println("Enter Principal,Time,Rate and N value");
				   		pa=sc.nextFloat();
				   		time=sc.nextFloat();
				   		rate=sc.nextFloat();
				   		number=sc.nextFloat();
				   		compoundinterest=hi.CompoundInterest(pa,time,rate,number);
				   		System.out.println("Compound Interest is:"+compoundinterest);
				   		break;
				default: System.out.println("unknown");
				 
			}
		
		sc.close();
    }
}
