import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class FirstProgram {

	public static void main(String[] args) {	
		
		
		LinkedList<String> names = new LinkedList<String>(); //Linked List là queue hoặc stack
		names.push("caleb"); // là thêm ptu đầu vào list (Stack) 
		names.add("Sue"); // là thêm ptu vào cuối list (Queue)
		names.push("sally");
		System.out.println(names.pop()); //lấy ptu đầu trong list Stack
		System.out.println(names.remove()); // xoá ptu trong agrument nếu ko có argument nó sẽ xoá phần tử đầu
		System.out.println(names.removeFirst()); //lấy ptu đầu trong list Stack
	}

}
