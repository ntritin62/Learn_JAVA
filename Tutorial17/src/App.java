class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("my name is: " + name );
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Tri Tin";
		person1.age = 37;
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "Tri";
		person2.age = 20;
		person2.speak();
		
		System.out.println(person1.name);

	}

}
