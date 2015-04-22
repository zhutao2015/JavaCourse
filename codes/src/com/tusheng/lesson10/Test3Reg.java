package com.tusheng.lesson10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3Reg {
	public static String getChars(String line){
		String p = "[^A-Z][A-Z]{3}([a-z]){1}[A-Z]{3}[^A-Z]";
		 Pattern pattern = Pattern.compile(p);
		 Matcher matcher = pattern.matcher(line);
		 if (matcher.find()){
			 return matcher.group(1);
		 }
		 return "";
	}
	

	public static void main(String[] args) throws IOException {
		Path pathname = Paths.get("/home/zhu/myself/JavaCourse/lesson10/y.txt");
		List<String> lines = Files.readAllLines(pathname, StandardCharsets.UTF_8);
		String out = "";
		for(String line : lines){
			out += getChars(line);
		}
		System.out.println(out);
	}

}
