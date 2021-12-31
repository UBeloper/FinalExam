import java.util.ArrayList;


public class ManagePerson {
	
	// 멤버변수 선언 - arrayList타입을 다루기 위해.
		ArrayList<Person> personList; 
		
		//생성자 - 배열 공간 열어 놓기
		public ManagePerson() {
			personList = new ArrayList<Person>();
		}
		
		// 메서드 - 리스트에 추가, 삭제, 리스트의 모든 내용 출력
		// 받는 것을 Person으로 받아놔
		
		// 리스트에 추가 - void : '~해!'하는 경우.
		
		public void addPerson(Person person) {
			personList.add(person);
		}
		
		// 리스트에서 삭제  // String타입의 이름(누구이름인지 모르잖아. 삭제할거니까 상관없구나.)을 받아와서 담아.
		public boolean removePerson(String personName) {
			for (Person tmp : personList) {
				
				if(tmp.getPersonName().equals(personName)) {
					personList.remove(tmp);
					return true;
				}
			}
			return false;
		}
		

		// 리스트의 모든 내용 출력
		public void showAllPerson() {
			for (Person tmp : personList) {
				tmp.doWork();
			}
		}
		
		
		
}
