import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {	//main method
		System.out.println("Hello World");
		Scanner in= new Scanner(System.in); //khai bao chuc nang nhap
		String s= in.nextLine(); //nhap s
//		String t= new String("hey"); //String là object
		
		if(s.equals("tin")) {
			System.out.println("hey tin");
		} else if(s.equals("sally")) {
			System.out.println("Hey Sally");
		} else {
			System.out.println("You're not welcome here");
		}
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		in.close();
	}

}
