
public class Student extends Person {
	
	// 생성자
	public Student(String personName) {
		super(personName); 		// 부모클래스의 생성자 호출
						   		// 받아온 값 부모쪽에 저장
						   		// 형태 기억
	}
	
	public void doWork() {
		System.out.println(getPersonName() + " 공부합니다.");
	}
	
		
	
}
