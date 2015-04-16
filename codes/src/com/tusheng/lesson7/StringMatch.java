package com.tusheng.lesson7;

public class StringMatch {
	private String str;
	
	public StringMatch(String x){
		this.str = x;
	}
	
	public int numberOfOccurence(char c){
		int cnt = 0;
		for(int i=0; i<this.str.length();i++){
			char x = str.charAt(i);
			if (c == x)
				cnt ++;
		}
		return cnt;
	}
	
	public String getMaxSubStr(int len){
		return "";
	}
}
