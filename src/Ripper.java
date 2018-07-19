import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ripper - a better way to read from console.

// Ripper r = new Ripper();
// r.readStyle();
public class Ripper {
	BufferedReader read;
	Ripper() {
		read = new BufferedReader(new InputStreamReader(System.in));
	}
	public String readLine() {
		try {
			return read.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public String readStyle(String inputText) {
		System.out.print(inputText);
		String s =  readLine();
		return s;
	}
	public String readStyle() {
		return readStyle("Input: ");
	}
}
