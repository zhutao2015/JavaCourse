package com.tusheng.lesson3;

public class Student {
	private String name;
	private String major;
	private int grade;
	private int[] cet4_scores;
	
	public Student(String name, String major, int grade, int[] cet4_scores){
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.cet4_scores = cet4_scores;
	}
	
	public void level_up(){
		this.grade += 1;
	}
	
	public boolean passed_cet4(){
		for(int i=0; i<cet4_scores.length; i++){
			if (cet4_scores[i] > 461){
				return true;
			}
		}
		return false;
	}
	
	public void printInfo(){
		System.out.println("Name: " + name);
		System.out.println("Major: " + major);
		System.out.println("Grade: " + (grade+1));
		if (passed_cet4()){
			System.out.println("Passed CET4!");
		}
		else{
			System.out.println("Not passed CET4!");
		}
	}
}
