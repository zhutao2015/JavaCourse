package com.tusheng.lesson7;

import java.util.ArrayList;

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
	
	private boolean isSame(String s){
		if (s.isEmpty()) return false;
		char c = s.charAt(0);
		for(int i=1; i<s.length();i ++){
			if (c != s.charAt(i))
				return false;
		}
		return true;
	}
	
	public String getMaxSubStr(int len){
		if (len > str.length()) return "";
		ArrayList<String> substrs = new ArrayList<String>();
		for(int i=0; i+len<str.length(); i++){
			String sub = str.substring(i, i+len);
			if (isSame(sub)){
				substrs.add(sub);
			}
		}
		if (substrs.isEmpty()) return "";
		String maxstr = substrs.get(0);
		for(String s: substrs){
			if (maxstr.compareTo(s) > 0)
				maxstr = s;
		}
		return maxstr;
	}
}
