
public class TestManageBoard {
	public static void main(String[] args) {
		
		ManageBoard mb = new ManageBoard();
		
		// 이형태에 익숙해져야한다!!! >>> ★★ set으로 테스트페이지에서 값 직접 넣는거
		// 한번에 생성자 아규먼트에 3개씩 넣는짓안함!!!
		Board b1 = new Board();
		b1.setbNum(1);
		b1.setbSubject("가나파");
		b1.setbName("김일식");
		
		mb.addBoard(b1);
		
		Board b2 = new Board();
		b2.setbNum(2);
		b2.setbSubject("라마다");
		b2.setbName("김이식");
		
		mb.addBoard(b2);
		
		Board b3 = new Board();
		b3.setbNum(3);
		b3.setbSubject("마카자");
		b3.setbName("김삼식");
				
		mb.addBoard(b3);
		
		// 값 들어있는지 테스트
		mb.showAllBoard();
		System.out.println();
		
		
		// 테스트 업데이트, 제거
		System.out.println("==업데이트테스트==");
		mb.updateBoard("김일식", "김육식");
		mb.showAllBoard();
		
		
		System.out.println();
		System.out.println("==제거테스트==");
		System.out.println(mb.removeBoard(1));
		mb.removeBoard(1);
		mb.showAllBoard();
		
		System.out.println();
		System.out.println("==업데이트테스트2==");
		mb.updateBoard("김이식", "김칠식");
		mb.showAllBoard();
		
		
		
		
		
	}

}
