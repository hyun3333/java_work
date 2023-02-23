package basic.begin;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	
		/*
		- 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		 가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		ex)
		입력받은 수 -> 30
		소수: 2 3 5 7 11 13 17 19 23 29
		소수의 개수: 10개
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받은 수 -> ");
		int num = sc.nextInt();
		
		for (int x = 1; x <= num; x++) {
			int a = 0;
			for (int y = 1; y <= x; y++) {
				if (x % y == 0) {
					a = a + 1;
				}
			}
			if (a == 2) {
				System.out.print(x + " ");
				
			}
				
		}
		

	}

}

















