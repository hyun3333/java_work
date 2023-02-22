package basic.loop;

import java.util.Scanner;

// 반복문 (while문)
public class WhileExample2 {

	public static void main(String[] args) {
		 
		
//		 48 ~ 150 사이의 정수 중 8의 배수로만 가로로 출력해 보세요.
		int e = 48;
		
		
		
//		while(i <= 150) {
//			if(i % 8 == 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		while(e <= 150) {
			System.out.print(e + " ");
			e += 8;
		}
		
		
//		1 ~ 100까지의 정수 중 4의 배수이면서
//		8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int f = 1;
		
		while(f <=  100) {
			if(f % 4 == 0 && f % 8 != 0) {
				System.out.print(f + " ");
			}
			f++;
		}
		System.out.println(" ");
//		1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력.
		
		int b = 1; //258의 배수를 구할사람(반복문 돌릴 애)
		int bb = 0; //258의 배수의 개수를 구할 집
		while(b <= 30000) {
			if (b % 258 == 0) {
				bb += 1; //258의 배수가 나타날때마다 1이 추가가 된다.
				//1+1+1+1+1+.....+1
			}
			b++;
		}
		System.out.print("258의 배수의 개수 : "+ bb);
		System.out.println(" ");
		
//		1000의 약수의 개수를 구하세요.
//		1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
//		그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		
		int c = 1;
		int cc = 0;
		
		while(1000>= c) {
			if (1000 % c == 0) {
				cc += 1;
			}
			c++;
		}
		System.out.print("1000의 약수의 개수 :" + cc);
		System.out.println(" ");
		
		int d = 1;
		int dd= 0;
		
		while(d <= 300) {
			if(300 % d == 0 && 250 % d == 0) {
				dd += 1;
			}
			d++;
		}
		
		System.out.println(dd);
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int ss = 1;
		
		while(s <= 9) {
			ss *= s; // ss = ss * s;
			s++;
		}
		System.out.println("입력 숫자 " + ss);
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
	
	
}
				
