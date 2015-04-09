package com.tusheng.lesson3;

public class Person{
	private String name;
	private String gender;
	private int age;
	
	public Person(String _name, String _gender, int _age){
		name = _name;
		gender = _gender;
		this.age = _age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean canMarry(){
		// male: age>=22
		// female: age>=20
		return (this.gender == "male" && this.age >= 22) || 
				(this.gender == "female" && this.age >= 20);
	}
	
	public void printme(){
		System.out.println("Name: " + this.name);
		System.out.printf("Gender: %s\n", gender);
		System.out.printf("Age: %d\n", age);
		if (this.canMarry()){
			System.out.println("I can marry!");
		}
		else{
			System.out.println("I cannot marry yet!");
		}
		
	}
	
	public static void main(String args[]){
		Person xiaoming = new Person("Xiaoming", "male", 35);
		xiaoming.printme();
	}
	
}

