import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FirstProgram {

	public static void main(String[] args) throws FileNotFoundException {	//main method
//	Dòng đầu tiên trong phương thức main tạo một đối tượng Scanner để đọc dữ liệu từ tệp "students.txt". Đối tượng Scanner được khởi tạo với đối số là một đối tượng File đại diện cho tệp cần đọc. Nếu tệp không tồn tại, FileNotFoundException sẽ được ném ra.
		Scanner in= new Scanner(new File("students.txt"));
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}

}
