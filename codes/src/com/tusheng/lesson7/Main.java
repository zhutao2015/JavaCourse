package com.tusheng.lesson7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatch s = new StringMatch("ccbbbaadef");
		char c = 'l';
		System.out.printf("number of %c: %d\n", c, s.numberOfOccurence(c));
		System.out.println("max sub str is:" + s.getMaxSubStr(2));
		System.out.println("max sub str is:" + s.getMaxSubStr(3));
		System.out.println("max sub str is:" + s.getMaxSubStr(1));
		System.out.println("max sub str is:" + s.getMaxSubStr(4));
		
	}

}
