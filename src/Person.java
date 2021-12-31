
public class Person {
	// 순서 : 멤버변수 -> 생성자 -> 오버로딩된 생성자 -> 메서드 -> 오버로딩된 메서드
	
	// 멤버변수
	private String personName;
	
	// 생성자	
	public Person(String personName) {
		this.personName = personName;
	}

	// 오버로딩된 생성자
	
	// 메서드
	public void doWork() {
		System.out.println("사람이 행동합니다.");
	}

	// private. getter setter 메서드
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
