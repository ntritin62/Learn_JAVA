
public class Person implements Info {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void start() {
		System.out.println("Hello started.");
	}

	@Override
	public void showInfo() {
		System.out.println("name is: " + name);

	}

}
