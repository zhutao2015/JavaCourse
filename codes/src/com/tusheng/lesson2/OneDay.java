package com.tusheng.lesson2;

public class OneDay {
	
	public static void main(String[] args) {
		OneDay one = new OneDay();
		one.sleep();
		one.have_meal(BREAKFASET);
		one.goto_work();
		one.code();
		one.have_meal(LUNCH);
		one.code();
		one.return_home();
		one.have_meal(SUPPER);
	}
}
