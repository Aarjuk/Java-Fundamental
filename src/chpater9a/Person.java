package chpater9a;

public class Person {
	
	String name;
	int age;
	String gender;
	
	
	public Person() {
		System.out.println("In Person default Constructor");
	}
	
	public Person(String name) {
		//this.name = name;
		System.out.println("In Person 2nd Constructor. Name is set");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
