package com.tusheng.lesson4;

public class Man extends Person {
	
	public Man(String _name, int _age, Leg[] legs){
		//this.name = _name;
		//gender = _gender;
		//age = _age;
		super(_name, "Male", _age, legs);
	}
	
	public void printName(){
		System.out.println(getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leg[] legs = {new Leg(), new Leg()};
		Man m = new Man("Xiaoming", 30, legs);
//		m.printInfo();
		m.printName();
	}

}
