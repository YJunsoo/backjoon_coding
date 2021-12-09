package backjoon;

import java.util.Scanner;

public class backjoon2753 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, leap=0; // 윤년 영어로 leap year
		a = sc.nextInt();
		
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			leap = 1;
			System.out.println(leap);
		} else {
			System.out.println(leap);
		}
		
	}
	
}
