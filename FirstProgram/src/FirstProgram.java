import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class FirstProgram {

	public static void main(String[] args) throws FileNotFoundException {	//main method
		
		LinkedList<String> names = new LinkedList<String>(); //Linked List là queue
		names.add("caleb");
		names.add("Sue");
		names.add("sally");
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}

}
