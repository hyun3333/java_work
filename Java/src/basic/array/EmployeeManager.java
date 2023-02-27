package basic.array;

import java.util.Scanner;

import org.jcp.xml.dsig.internal.MacOutputStream;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사원의 정보 : 사번, 이름, 나이, 부서명

		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		
		// 실제로 입력된 데이터 (사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		while(true) {
			System.out.println("\n======== 사원 관리 프로그램 ========");
			
			System.out.println("#1. 사원 정보 신규 등록");
			//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
            //사번은 중복되면 안됩니다. 이름은 같은 이름이 있기 때문에 중복이되도 상관이 없다
            //(무한루프를 구현해서 중복이 발생하면 다시 입력받기.)
			
			System.out.println("#2. 모든 사원 정보 보기");
			//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
            //만약 사용자가 사원 등록을 한 명도 하지 않았다면
            //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다
			
			System.out.println("#3. 사원 정보 검색");
			//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
            //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
			
			System.out.println("#4. 사원 정보 수정");
			//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
            //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
            //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
            //사번이 존재하지 않는다면 없다고 얘기해 주세요.
			
			System.out.println("#5. 사원 정보 삭제");
			//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
            //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
            //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
            //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
            //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
			
			System.out.println("#6. 프로그램 종료");
			System.out.println("=================================");
			
			System.out.print("> ");
			int menu = sc.nextInt();
			
			int num = 0;
			
			String user = "";
			String name = "";
			int ag = 0;
			String depar = "";
			
			if(menu == 1) {
				for(int i=0; i<userNums.length; i++) {
					System.out.print("사번 : ");
					user = sc.next();
					for(int j=0; j<userNums.length; j++) {
						if(user.equals(userNums[j])) {
							num = 1;
							i--;
							break;
						}
					} // j포문 끝
					if(num == 1) {
						System.out.println("중복 사번입니다.");
						num = 0;
						continue;
					} else {
						userNums[i] = user;
					} 
					System.out.print("이름 : ");
					name = sc.next();
					System.out.print("나이 : ");
					ag = sc.nextInt();
					System.out.print("부서명 : ");
					depar = sc.next();
					
				} // 1.번 if for문 끝
			}
			//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
            //만약 사용자가 사원 등록을 한 명도 하지 않았다면
            //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다
			else if(menu == 2) {
				for(int i=1; i<userNums.length; i++) {
					
				}
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu == 5) {
				
			} else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				//continue 써도 되지만 마지막이라 자동으로 위로 올라가기 때문에 굳이 안써도 된다.
			}
			
			
			
		} //end while true (표시를 해두면 어디까지인지 확인하기 쉽다) *개꿀팁*
		
		
		

	} // end main

}
