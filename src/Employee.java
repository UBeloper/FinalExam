
public class Employee extends Person{

	public Employee(String personName) {
		super(personName);
	}
	
	public void doWork() {
		System.out.println(getPersonName() + " 근무 중입니다.");
	}
	
	
}
