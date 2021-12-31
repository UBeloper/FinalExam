
public class Children extends Person{
	
	public Children(String personName) {
		super(personName);
	}

	@Override
	public void doWork() {
		System.out.println(getPersonName() + " 뛰어놉니다.");
	}
}
