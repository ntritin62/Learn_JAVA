
public class App {

	public static void main(String[] args) {
		int value = 7;

		int[] values; // tham chiếu

		values = new int[3]; // khởi tạo mạng và tham chiếu tới mảng
		System.out.println(values[0]);

		values[0] = 10;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
	}

}
