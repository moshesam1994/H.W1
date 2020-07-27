package q7q8q9;

public class Person {
	private String name;
	private int id;
	private int age;
	private int salary;
	private String address;

	public Person(String name, int id, int age, int salary, String address) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	public Person() {
		
		this.name = name;
		this.id = (int) (Math.random()*100000000+1);
		this.age = (int) (Math.random()*120+1);
		this.salary = (int) (Math.random()*10000+1);
		this.address = address;
	}

	public Person(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public void Print() {
		System.out.println("Name person:" + name + ",Age:" + age + ",Address:" + address);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Person p1 = new Person("momp", 1234567);
		p1.Print();
	}

}
