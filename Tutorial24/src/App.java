
public class App {

	public static void main(String[] args) {
		String info = "";

		info += "My name is tin.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		// More efficient.
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Tin");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("my name is Roger.").append(" ").append("I am a skyiver.");

		System.out.println(s.toString());

		System.out.println("Here is some text.\t That was a tab.\n that was a newline");
		System.out.println("More text.");

		System.out.printf("Total cost %d\n, quantity is %d", 5, 120);
	}

}
