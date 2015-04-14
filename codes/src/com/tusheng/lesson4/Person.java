package com.tusheng.lesson4;

public class Person {
	public String name;
	public String gender;
	public int age;
	private Leg legs[];
	
	public Person(String _name, String _gender, int _age, Leg[] ls){
		name = _name;
		gender = _gender;
		age = _age;
		legs = ls;
	}
	
	public Person(int _age){
		setName("Unknown");
		age = _age;
		gender = "Male";
	}
	
	public Person(String _name){
		setName(_name);
		gender = "Male";
		age = 20;
	}
	
	public Person(){
		setName("Unknown");
		gender = "Male";
		age = 20;
	}
	
	public void setName(String _name){
		name = _name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setGender(String _gender){
		gender = _gender;
	}
	public void setAge(int _age){
		age = _age;
	}
	
	public void printInfo(){
		System.out.println("Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("Age:" + age);
		
		for (int i=0; i<legs.length; i++){
			legs[i].print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Xiaoming");
		p1.printInfo();
	}

}
