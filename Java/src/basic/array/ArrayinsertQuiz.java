package basic.array;

import java.util.Scanner;

public class ArrayinsertQuiz {

	public static void main(String[] args) {
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

        */
		
		Scanner sc = new Scanner(System.in);
		
		String[] foods = new String[50];
		
		int num = 0;
		
		for(int i=0; i<=foods.length; i++) {
			System.out.print("먹을 음식은? ");
			String name = sc.next();
			if (name.equals("배불러")) {
				System.out.println("입력 종료.");
				break;
			}
			for(int j=0; j<foods.length; j++) {
				if(foods[j] == null) {
				} else {
					if (foods[j].equals(name)) {
						num = 1;
						break;
					}
				}
			}
			if (num == 1) {
				System.out.println("중복음식");
				num = 0;
			}else {
				foods[i] = name;
			}

		}
			
		
		System.out.println("----------------------");
		System.out.print("내가 먹고싶은 음식들 : ");
		
		for(String s : foods) {
			if (s == null) break;
			System.out.print(s + " ");
		}
		
		sc.close();
		
		
		
		
		
		

	}

}
