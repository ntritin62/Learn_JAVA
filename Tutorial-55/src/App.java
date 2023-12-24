import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Five");
		map.put(6, "Five");
		map.put(4, "Five");
		map.put(2, "Five");
		
		String text = map.get(4);

		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int	key = entry.getKey();
			String value = entry.getValue();
		}
	}

}
