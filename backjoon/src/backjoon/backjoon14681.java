package backjoon;

import java.util.Scanner;

public class backjoon14681 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a, b, q=0; // 입력받는 정수 a 와 b, Quadrant(사분면) == q 
		
		a = sc1.nextInt();
		b = sc1.nextInt();
		
		if(a >= 1 && b >= 1) { // 제 1사분면 [ a 가 1보다 크면서, b 도 1보다 큼 ] 
			q = 1;
			System.out.println(q);
		} else if(a >= 1 && b <= -1) { // 제 4사분면 [ a 가 1보다 크면서, b 는 -1보다 작음 ]
			q = 4;
			System.out.println(q);
		} else if(a <= -1 && b >= 1) { // 제 2사분면 [ a가 -1보다 작으면서, b 는 1보다 큼 ]
			q = 2;
			System.out.println(q);
		} else if(a <= -1 && b <= -1) { // 제 3사분면 [ a가 -1보다 작으면서, b도 -1보다 작음 ]
			q = 3;
			System.out.println(q);
		}
	}
}
