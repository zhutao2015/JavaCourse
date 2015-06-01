package com.tusheng.lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "x.txt";
		File x = new File(path);
		InputStream stream = new FileInputStream(x);
		char[] bytes = new char[1024];
		int temp = 0;
		int i = 0;
		while((temp = stream.read()) != -1){
			if (i >= 1024) break;
			bytes[i++] = (char)temp;
		}
		for(i=0; i<bytes.length; i++){
			System.out.print(bytes[i]);
		}

	}

}
