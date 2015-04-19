package com.tusheng.lesson9;

public class TestMain {
	
	public static void main(String argv[]){
		ClassMore.printStuff("stuff");
		ClassMore x = new ClassMore();
		x.printStuff2("stuff");
		System.out.println("print object: " + x);
		
//		AbstractBase ab = new AbstractBase();
		AbstractBase ab = new AbstractChild();
		ab.sayHello();
	}

}
