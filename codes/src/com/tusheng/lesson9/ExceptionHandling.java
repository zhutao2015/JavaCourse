package com.tusheng.lesson9;

import java.util.ArrayList;

public class ExceptionHandling {
	
	public Integer getValue(ArrayList<Integer> x, int index){
		try{
			return x.get(index);
		}
		catch(Exception e){
			System.out.println(e);
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling handler = new ExceptionHandling();
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(45);
		System.out.println(handler.getValue(x, 5));
	}

}
