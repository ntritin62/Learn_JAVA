class Thing {
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		System.out.println(name);
	}
	
}
public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";

		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();

	}

}
