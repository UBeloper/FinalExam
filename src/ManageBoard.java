import java.util.ArrayList;

public class ManageBoard {
		ArrayList<Board> boardList;
		
		public ManageBoard() {
			boardList = new ArrayList<Board>();
		}
		
		public void addBoard(Board board) {
			boardList.add(board);
		}
		
		
	
		public void updateBoard(String preName, String postName) {
			for (int i = 0; i < boardList.size(); i++) {
				Board board = boardList.get(i);
				if((board.getbName()).equals(preName)) {
					Board tmp = new Board();
					tmp.setbNum(board.getbNum());
					tmp.setbSubject(board.getbSubject());
					tmp.setbName(postName);
					boardList.set(i, tmp); // set(i번째, 객체);
				}
 			}
		}
		
		
		
		public boolean removeBoard(int bNum) {
			for(int i = 0; i < boardList.size(); i++) {
				Board board = boardList.get(i);
				if(board.getbNum() == bNum) {
					boardList.remove(i);
					return true;
				}		
			}
			return false;
		}
		
		public void showAllBoard() {
			for(Board board : boardList) {
				System.out.println(board.getbNum() + ":" + board.getbSubject() + ":" + board.getbName());
			}
		}
		
}
