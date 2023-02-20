package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		int year = 2023 - age;
		
		System.out.printf("이름은 %s이고 나이는 %d 입니다 출생년도는 %d년 입니다", name, age, year);
		
		sc.close();
		
		

	}

}
