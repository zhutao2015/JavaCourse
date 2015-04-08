package com.tusheng.lesson2;

public class Person extends Animal{
	public Person(String name, int leg_num, boolean can_swim, boolean can_jump){
		super(name, leg_num, can_swim, can_jump);
	}
	
	public static void main(String[] args) {
		Person zhutao = new Person("Zhu Tao", 4, true, true);
		zhutao.print_info();
		
		Person xiaoming = new Person("XiaoMing", 4, false, true);
		xiaoming.print_info();
	}

}
