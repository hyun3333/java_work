package basic.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		   지속적으로 문제를 출제한 후 정답을 입력받으세요.
		   사용자가 0을 입력하면 반복문을 탈출시키세요.
		 
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------연산 퀴즈----------");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		
		int ans = sc.nextInt();
		
		while(true) {
			int st = (int)(Math.random()*2);
			int num1 = (int)((Math.random()*100)+1);
			int num2 = (int)((Math.random()*100)+1);
			if (st == 1) {
				System.out.println(num1 + "+" + num2 + "=");
				System.out.println("> ");
			} else {
				System.out.println(num1 + "-" + num2 + "=");
				System.out.println("> ");
			}
		}
			
				
		
		
		
}
}