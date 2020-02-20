package com.task.maven.demo;
 
public class App 
{

	public class InterestCalculator {
		public float SimpleInterest(float pa,float time,float rate){
			return (pa*time*rate)/100;
		}
		public double CompoundInterest(float pa,float time,float rate,float number){
			return pa*Math.pow((1+(rate/number)),number*time);	 
		}
			
	}
}
