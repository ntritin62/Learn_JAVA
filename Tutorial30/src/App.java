
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant2.grow();
	}

}
