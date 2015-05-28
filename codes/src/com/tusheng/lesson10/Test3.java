package com.tusheng.lesson10;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test3 {
	private static boolean allUpper(String s){
		for(int i=0; i<s.length();i++){
			if (!Character.isUpperCase(s.charAt(i)))
				return false;
		}
		return true;
	}
	
	
	public static String getChars(String line){
		String out = "";
		for(int i=3; i<line.length()-4; i++){
			char x = line.charAt(i);
			if (!Character.isLowerCase(x))
				continue;
			String left = line.substring(i-3, i);
			String right = line.substring(i+1, i+4);
			if (allUpper(left) && allUpper(right)){
				if (i-4>=0 && !Character.isUpperCase(line.charAt(i-4)) 
						&& i+4<line.length() && !Character.isUpperCase(line.charAt(i+4))){
					out += x;
				}
			}
		}
		return out;
	}

	public static void main(String[] args) throws IOException {
		Path pathname = Paths.get("D:\\java\\JavaCourse\\lesson10\\y.txt");
		List<String> lines = Files.readAllLines(pathname, StandardCharsets.UTF_8);
		String out = "";
		for(String line : lines){
			out += getChars(line);
		}
		System.out.println(out);
	}

}
