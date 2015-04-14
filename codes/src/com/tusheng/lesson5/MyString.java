package com.tusheng.lesson5;

public class MyString {
	
	private String str;
	
	public MyString(String x){
		str = x;
	}
	
	public void upper(){
		String temp = "";
		for (int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if (c <= 'Z' && c >= 'A'){
				temp += c;
			}
			else{
				temp += (char)(c - 32);
			}
		}
		str = temp;
	}
	
	public void reverse(){
		String temp = "";
		for(int i=length()-1; i>=0; i--){
			temp += str.charAt(i);
		}
		str = temp;		
	}
	
	public void concat(MyString x){
		str = str.concat(x.toValue());
	}
	
	public String toValue(){
		return str;
	}
	
	public int length(){
		return str.length();
	}
	
	public void print(){
		System.out.println(str);
	}

	public static void main(String[] args) {
		MyString x = new MyString("abc");
		x.print();
		x.upper();
		x.print();
		x.reverse();
		x.print();
		x.concat(new MyString("xyz"));
		x.print();
	}

}
