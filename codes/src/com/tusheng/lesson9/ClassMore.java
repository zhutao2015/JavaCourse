package com.tusheng.lesson9;

public class ClassMore {

	public void printStuff2(String x){
		System.out.println("From member method: " +x);
	}

	public static void printStuff(String x){
		System.out.println("From static method: " +x);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am ClassMore";
	}
}
