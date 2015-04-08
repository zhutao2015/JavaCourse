package com.tusheng.lesson2;

public class Animal {
	private int _leg_num;
	private boolean _can_swim;
	private boolean _can_jump;
	private String _name;

	public Animal(String name, int leg_num, boolean can_swim, boolean can_jump){
		this._name = name;
		this._leg_num = leg_num;
		this._can_swim = can_swim;
		this._can_jump = can_jump;
	}
	
	public boolean can_swim(){
		return this._can_swim;
	}
	
	public boolean can_jump(){
		return this._can_jump;
	}
	
	public void print_info(){
		System.out.printf(this._name + " has %d legs\n", this._leg_num);
		if (can_jump()){
			System.out.println(this._name + " can jump");
		}
		else{
			System.out.println(this._name + " cannot jump");
		}
		if (can_swim()){
			System.out.println(this._name + " can swim");
		}
		else{
			System.out.println(this._name + " cannot swim");
		}
	}

}
