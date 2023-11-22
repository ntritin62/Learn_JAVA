class Person {
	String name;
	int age;

	void speak() {
		System.out.println("my name is: " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;

	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();

		person1.name = "Tin";
		person1.age = 21;

		person1.speak();
		int years = person1.calculateYearsToRetirement();
		System.out.println(years);

		int age = person1.getAge();
		System.out.println("Age is: " + age);

	}

}
