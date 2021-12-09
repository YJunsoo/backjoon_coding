package backjoon;

import java.util.Scanner;

public class backjoon9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String rank = "";
		
		if(a <= 100 && a >= 90) {
			rank = "A";
			System.out.println(rank);
		}
		else if(a <=89 && a >= 80) {
			rank = "B";
			System.out.println(rank);
		}
		else if(a <= 79 && a >= 70) {
			rank = "C";
			System.out.println(rank);
		}
		else if(a <= 69 && a >= 60) {
			rank = "D";
			System.out.println(rank);
		}
		else {
			rank = "F";
			System.out.println(rank);
		}
	}
}
