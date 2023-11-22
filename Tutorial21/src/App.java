class Frog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}

public class App {
	public static void main(String[] args) {
		Frog frog1 = new Frog();

		frog1.setName("tin");
		frog1.setAge(1);

		System.out.println(frog1.getName());

	}

}
