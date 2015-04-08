package com.tusheng.lesson2;

public class OneDay {
	

	private static final int LUNCH = 1;
	private static final int SUPPER = 2;
	private static final int BREAKFASET = 0;

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

	private void return_home() {
		System.out.println("Returning home");
	}

	private void code() {
		System.out.println("Writing codes");
	}

	private void goto_work() {
		System.out.println("Go to work");
		
	}

	private void have_meal(int meal) {
		switch(meal){
			case BREAKFASET:
				System.out.println("Having breakfast");
				break;
			case LUNCH:
				System.out.println("Having lunch");
				break;
			case SUPPER:
				System.out.println("Having supper");
				break;
			default:
				System.out.println("You eat too much!");
				break;
		}
	}

	private void sleep() {
		System.out.println("Sleeping");
	}

}
