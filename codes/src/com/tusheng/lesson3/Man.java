package com.tusheng.lesson3; // 引入包，如果是默认包，则无需此行

// 定义类
public class Man {
	// 定义成员变量
	private int age;
	private String name;
	private double height;
	
	// 构造函数
	public Man(int _age, String _name, double _height){
		age = _age;
		name = _name;
		height = _height;
	}

	// 成员方法
	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void printInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+getAge());
		System.out.println("Height: "+getHeight());
	}

}
