import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {	//main method
	
		Scanner in= new Scanner(System.in); //khai bao chuc nang nhap
		System.out.println("Give us a size.");
		int size = in.nextInt();
		
		
		
		int[] grades = new int[size];
		
		for(int i = 0; i < size; i++) {
			grades[i] = in.nextInt();
		}
		
	
		in.close();
		
		System.out.println("Enter " + size + " numbers. Press enter after each");
		for(int i = 0; i< size; i++) {
			System.out.println(grades[i]);
		}
		
	}

}
