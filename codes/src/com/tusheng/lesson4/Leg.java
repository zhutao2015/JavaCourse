package com.tusheng.lesson4;

public class Leg {
	double length;
	double weight;
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void print(){
		System.out.println("Weight:"+getWeight());
		System.out.println("Length:"+getLength());
	}

	
	public Leg(double l, double w){
		setWeight(w);
		setLength(l);
	}
	
	
	
	public Leg(){
		setWeight(10);
		setLength(100);
	}
}
