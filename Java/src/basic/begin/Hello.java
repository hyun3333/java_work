package basic.begin;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 : ");
		int gu = sc.nextInt();
		System.out.println("구구단 " + gu + "단");
		
		for(int i = 1 ; i <= 9 ; i++)
			System.out.println(gu + "*" + i + "=" + (gu*i));
		
		
		
		
		sc.close();		
		
		

	}

}
