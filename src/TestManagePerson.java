
public class TestManagePerson {

	public static void main(String[] args) {
		ManagePerson person = new ManagePerson();
		person.addPerson(new Student("홍길동"));
		person.addPerson(new Employee("김삿갓"));
		person.addPerson(new Children("이도령"));

		person.showAllPerson();
		
		// 김삿갓 삭제
		System.out.println();
		System.out.println(person.removePerson("김삿갓"));
		person.removePerson("김삿갓");
		person.showAllPerson();
		
	}

}
