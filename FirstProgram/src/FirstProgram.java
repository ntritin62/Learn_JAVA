import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class FirstProgram {

	public static void main(String[] args) {	
		
		
		LinkedList<String> names = new LinkedList<String>(); 
		names.push("caleb"); 
		names.push("Sue"); 
		names.push("sally");
		
		ListIterator<String> it = names.listIterator();

		it.next();
		it.next();
		it.add("Susan");
		
		
		
		for(String s:names) {
			System.out.println(s);
		}
		
	}

}
