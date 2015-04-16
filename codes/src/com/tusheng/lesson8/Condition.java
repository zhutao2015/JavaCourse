package com.tusheng.lesson8;

public class Condition {
	public String getLevel(int age){
		if (age<3)
			return "婴儿";
		else if (age < 15)
			return "少年";
		else if (age < 30)
			return "青年";
		else if (age < 55){
			return "中年";
		}
		else return "老年";
	}
	
	
	
	public String getLevel2(int age){
		switch(age){
		case 0:
		case 1:
		case 2:
			return "婴儿";
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			return "少年";
		//其他情况
		default:
			return "老年";
		
		}
	}
	
	public static void main(String args[]){
		Condition c = new Condition();
		int age = 20;
		System.out.println("1.age of "+ age + " is "+c.getLevel(age));
		System.out.println("2.age of "+ age + " is "+c.getLevel2(age));
	}
}
