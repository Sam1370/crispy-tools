import java.util.HashMap;
import java.util.Map;

public class TextList {
	Ripper r;
	HashMap<Integer, String> map;
	public TextList(Ripper r) {
		this.r = r;
		map = new HashMap<>();
	}
	public void add(int index, String desc) {
		map.put(index, desc);
	}
	public int ask() {
		display();
		boolean finished = false;
		while (!finished) {
			int response = Integer.parseInt(r.readStyle());
			if (map.containsKey(response)) {
				finished = true;
				return response;
			} else {
				System.out.println("Invalid option");
			}
		}
		return -1;
	}
	public void display() {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("[" + key + "] " + value);
		}
	}
	public HashMap<Integer, String> getMap() {
		return map;
	}
	public void setMap(HashMap<Integer, String> map) {
		this.map = map;
	}
}
