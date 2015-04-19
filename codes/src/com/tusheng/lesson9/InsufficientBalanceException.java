package com.tusheng.lesson9;

public class InsufficientBalanceException extends Exception {
	private int amount;
	
	public InsufficientBalanceException(int amount){
		this.amount = amount;
	}
	
	public int getAmount(){
		return this.amount;
	}
}
