package com.tusheng.lesson8;

import java.util.ArrayList;

public class Condition {
	public String getLevel(int age){
		if (age<3)
			return "婴儿";
		else if (age < 15)
			return "少年";
		else if (age < 30)
			return "青年";
		else if (age < 55){
			return "中年";
		}
		else return "老年";
	}
	
	public boolean isMale(String gender){
		switch(gender){ // int, String, enum
		case "Male":
			return true;
		case "Female":
			return false;
		default:
			return false;
		}
	}
	
	public String getLevel2(int age){
		switch(age){
		case 0:
		case 1:
		case 2:
			return "婴儿";
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
			return "少年";
		//其他情况
		default:
			return "老年";
		
		}
	}
	
	public ArrayList<Integer> sort(ArrayList<Integer> ints){
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		for(Integer i : ints){
			if (sorted.isEmpty()){
				sorted.add(i);
			}
			else{
				int pos=sorted.size();
				for(int j=sorted.size()-1; j>=0; j--){
					if (i<sorted.get(j)){
						pos = j;
					}
				}
				
				// 将最后一个元素后移一位
				if (pos < sorted.size()){
					sorted.add(sorted.get(pos));
				}
				
				// 将pos前所有元素后移一位
				for(int k=sorted.size()-1; k>pos; k--){
					sorted.set(k, sorted.get(k-1));
				}
				// 将pos设置为当前元素
				if (pos<sorted.size())
					sorted.set(pos, i);
				else
					sorted.add(pos, i);
				
			}
		}
		return sorted;
	}
	
	public static void main(String args[]){
		Condition c = new Condition();
//		int age = 20;
//		System.out.println("1.age of "+ age + " is "+c.getLevel(age));
//		System.out.println("2.age of "+ age + " is "+c.getLevel2(age));
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(5);
		ints.add(2);
		ints.add(3);
		ints.add(1);
		ints.add(6);
		ints.add(0);
		ints.add(10);
		ints.add(4);
		ints.add(2);
		ints.add(2);
		ints.add(6);
		ints.add(0);
		for(Integer i : ints){
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayList<Integer> sorted = c.sort(ints);
		for(Integer i : sorted){
			System.out.print(i + " ");
		}
	}
}
