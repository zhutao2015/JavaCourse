package com.tusheng.lesson4;

public class Man extends Person {
	
	public Man(String _name, int _age){
		//this.name = _name;
		//gender = _gender;
		//age = _age;
		super(_name, "Male", _age);
	}
	
	public void printName(){
		System.out.println(getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man("Xiaoming", 30);
//		m.printInfo();
		m.printName();
	}

}
