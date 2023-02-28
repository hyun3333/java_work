package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class RussianRoulette {

	public static void main(String[] args) {
		
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		Scanner sc = new Scanner(System.in);
		
		// 1. 게임 인원 입력
		
		int full = 0;
		int i;
		int count;
		while (true) {
			System.out.println("게임에 참가하실 인원을 입력하세요.");
			System.out.println("최소 2인 최대 4인까지 참여 가능합니다.");
			System.out.print("> ");
			full =  sc.nextInt(); // 인원
			
			
			if(2>full || 4<full) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if (2<=full || full<=4) {
				System.out.println(full + "명의 인원을 선택하셨습니다.");
			}
			
			
			break;
		}
		
		// 2. 플레이어 이름 등록
		// 배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		
		String[] userNames = new String [full];
		
		String user = "";
		
		for (i=0; i<full; i++) {
			
			System.out.println("참가자의 이름을 등록하세요.");
			System.out.print("> ");
			user = sc.next();
			
			userNames[i] = user;
			
			System.out.println(userNames[i] + "님이 참가하셨습니다.\n");
		}
		
		// 실탄 개수 입력(1미만이면 안되고 5초과도 안된다)
		
		int bullet = 0;
		while (true) {
			System.out.println("총알의 개수를 입력하세요");
			System.out.println("1발부터 최대 5발까지 입력가능");
			System.out.println("> ");
			bullet = sc.nextInt(); // 총알 개수
			if (bullet<1 || bullet>5) {
				System.out.println("총알의 개수가 맞지 않습니다");
				continue;
			} else if (bullet>0 || bullet<6) {
				System.out.println(bullet + "발을 선택하셨습니다.");
			}
			
			break;
		} // 실탄 입력개수 while true 끝
		
		
		// 실탄을 탄창에 배치합니다.
		
		
		
		
		// 난수를 생성하셔서 실탄을 탄창에 배치합니다.
		// false -> true로 바꾸는 것이 실탄 장전입니다.
		// 난수는 중복으로 발생 할 가능성이 있기 때문에 중복 방지 로직을 세워서
		// 같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		
		boolean[] bulletPos = new boolean[6];
		
		bulletPos = (int) (Math.random()*5)+1);
		
		System.out.println(Arrays.toString(bulletPos));
		
		
		// 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없습니다.
		
		// 일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		// 이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		// 따로 변수를 선언하지 않습니다.
//		sc.nextLine();
		
		
		
		// 최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		// 또는 총알이 다 소비될 때 까지 게임을 진행해 주세요.
		// 총알을 소모하면 true값을 false로 변경해 주세요.
		// 사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
//sc.close();
	}

}
