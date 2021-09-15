package com.lti.client;

import com.lti.model.Flight;

public class Main {
	public static void main(String[] args) {
		Flight fl=new Flight(1001,"Mumbai","Pune");
		System.out.println(fl.getFlightId()+" "+fl.getSource()+" "+fl.getDestination());
	
	int num1=10;
	int num2=20;
	
	//Test data
	if(add(num1,num2)==30) {
		System.out.println("Test Passed.");
		
	}
	else {
		System.out.println("Test failed.");
	}
	
	
	}
	
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	
	public static boolean compare(int n1,int n2 ){
		if(n1==n2)
		{
			return true;
		}
		return false;
	}
	
}
