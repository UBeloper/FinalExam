import java.util.ArrayList;

public class PersonTest {
	
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		
		// 배열로 처리하기 쉽게끔 
		// 안하면 제네릭 클래스도 만들어야하고, 일일이 <student> <employee> <children> 다 만들어야하니까.
		personList.add(new Student("일훈이"));
		personList.add(new Student("이훈이"));
		personList.add(new Student("삼훈이"));

		personList.add(new Employee("한식이"));
		personList.add(new Employee("두식이"));
		
		personList.add(new Children("아이1"));
		personList.add(new Children("아이2"));
		
		// ============== for문 ==============
		for( int i = 0; i < personList.size(); i++ ) {
			Person tmp = personList.get(i);  //arraylist에서 객체 받아올때 get
			tmp.doWork(); 
		}
		
		System.out.println();
		
		
		System.out.println("==============향상된 for문==============");
							// 위치제어 없이 쭉 출력할 땐 이게 좋겠지.
		for ( Person tmp : personList ) {
			tmp.doWork();
		}

		
		
		
		
		
	}
}
