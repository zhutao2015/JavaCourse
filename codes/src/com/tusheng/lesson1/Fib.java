package com.tusheng.lesson1;

import java.util.Scanner;

public class Fib {
	/*
	 * Fib数列
	 * F(0)=0
	 * F(1)=1
	 * F(n) = F(n-1) +F(n-2) (n>1)
	 * 
	 * 输入：数字n
	 * 输出：Fib数列 F(0), F(1), ..., F(n)
	 */
	
	public int fib(int n) {
        if (n <0)
            return ;
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else{
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Fib f = new Fib();
		for(int i=0; i<num; i++)
			System.out.printf("%d ", f.fib(i));
	}

}
