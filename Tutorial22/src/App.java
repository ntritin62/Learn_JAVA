class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Contructor running!");
		
	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("Third constuctor running");
		this.name = name;
		this.code = code;
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Bertie");

		Machine machine3 = new Machine("Tin", 7);

	}

}
