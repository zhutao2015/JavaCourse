package com.tusheng.lesson2;

public class JiuJiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++){
			for(int j=1; j<=i; j++){
				printout(i, j);
			}
			System.out.println();
		}
	}

	private static void printout(int i, int j) {
		// TODO Auto-generated method stub
		String numbers[] = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十",
				"十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九","二十",
				"二十一", "二十二", "二十三", "二十四", "二十五", "二十六", "二十七", "二十八", "二十九","三十",
				"三十一", "三十二", "三十三", "三十四", "三十五", "三十六", "三十七", "三十八", "三十九","四十",
				"四十一", "四十二", "四十三", "四十四", "四十五", "四十六", "四十七", "四十八", "四十九","五十",
				"五十一", "五十二", "五十三", "五十四", "五十五", "五十六", "五十七", "五十八", "五十九","六十",
				"六十一", "六十二", "六十三", "六十四", "六十五", "六十六", "六十七", "六十八", "六十九","七十",
				"七十一", "七十二", "七十三", "七十四", "七十五", "七十六", "七十七", "七十八", "七十九","八十",
				"八十一"};
		int m = i * j;
		if (m < 10){
			System.out.printf("%s%s得%s   ", numbers[j-1], numbers[i-1], numbers[i*j-1]);
		}
		else{
			System.out.printf("%s%s%s   ", numbers[j-1], numbers[i-1], numbers[i*j-1]);
		}
	}

}
