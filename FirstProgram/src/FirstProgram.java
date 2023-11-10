import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class FirstProgram {

	public static void main(String[] args) throws FileNotFoundException {	//main method

		Scanner in= new Scanner(new File("students.txt"));
		
		List<String> students = new ArrayList<String>(); //List giống kiểu lớp trù tượng của ArrayList
		
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		for(int i = 0; i< students.size();i++) {
			System.out.println("name: " + students.get(i));
		}
		in.close();
	}

}
