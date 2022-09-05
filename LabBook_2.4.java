public class Person {
	private String name;
	private int perId;
	private String phoneNo;
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Person(String name, int perId,String phoneNo) {
		super();
		this.name = name;
		this.perId = perId;
		this.phoneNo=phoneNo;
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
         Person person=new Person("mohan",1002,"6263531830");
         person.getPerId();
         person.getName();
         person.getPhoneNo();
	}

}

