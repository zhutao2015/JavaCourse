package com.tusheng.lesson6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Vector;

public class Circle{
	public double calculateArea(int radius){
		return 3.14 * radius * radius;
	}
	
	
	public static void main(String argv[]){
//		Circle c = new Circle();
//		int r = 20;
//		System.out.printf("Area of Circle(%d) is %.2f\n", r, c.calculateArea(r));
//		System.out.print("Area of Circle(" + r + ") is " + c.calculateArea(r));

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		HashMap<String, Integer> x = new HashMap<String, Integer>();
		x.put("hello", 10);
		System.out.println(x.get("hello"));
		
		String ss = "123";
//		ss.setCharAt(0, '9');
		StringBuffer s = new StringBuffer("123");
		System.out.println(s);
		s.setCharAt(0, '9');
		System.out.println(s);
		double area = Math.PI * Math.pow(10, 2);
	}
}