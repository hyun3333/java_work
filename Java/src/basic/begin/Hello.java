String[] userNames = new String[4];
		String user = "";
		int count = 0;
		
		boolean human = false;
		while (true) {
			
			System.out.println("사용자의 이름을 작성하세요 : ");
			System.out.print("> ");
			user = sc.next();
			
			int i;
			for (i=0; i<userNames.length; i++) {
				if(user.equals(userNames[i])) {
					human = true;
					break; // 이름 저장
				} // if문 끝
			} // i 포문 끝
			
			
			System.out.println(user + "님이 등록되었습니다.");
			
			userNames[count] = user;
			count++;
			
		}
		
		
		
		
		

	}

}

















