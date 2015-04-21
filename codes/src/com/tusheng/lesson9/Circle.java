package com.tusheng.lesson9;

public class Circle extends Shape implements Computable{
	
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle with radius: " + this.radius;
	}
	
	public void printInfo() {
		System.out.println(this);
		System.out.println("Area: " + calculateArea());
		System.out.println("Zhouchang: " + calculateZhouChange());
	}
	
	public static void main(String argv[]){
		Circle c = new Circle(10);
		c.printInfo();
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculateZhouChange() {
		return 2 * Math.PI * radius;
	}
}
