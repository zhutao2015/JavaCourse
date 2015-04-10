package com.tusheng.lesson3;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Man m = new Man(29, "Jiangwen", 180.5);
		m.printInfo();
		
		Person p = new Person("Jim", "female", 34);
		p.printme();
		*/
		
		int[] scores = {296, 456, 440, 345};
		Student s = new Student("Tom", "Computer Science", 1, scores);
		s.printInfo();
		s.level_up();
		s.printInfo();
	}

}
