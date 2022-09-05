public class Person {
	private String name;
	private int perId;
	private long phoneNo;
	public Person(String name, int perId) {
		super();
		this.name = name;
		this.perId = perId;
		System.out.println("Argumented Countructor...");
	}
	public Person() {
		System.out.println("no-argument counstrctor...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public static void main(String[] args) {
         Person person=new Person("mohan",1002);
         person.getPerId();
         person.getName();
	}

}

