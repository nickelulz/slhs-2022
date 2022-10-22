import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Jester {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("sample.in.txt"));
		ArrayList<String> fungeon = new ArrayList<>();
		int test_cases = in.nextInt();
		in.nextLine();
		for (int t = 0; t < test_cases; t++) {
			String name = in.nextLine().replace(":","");
			String joke = "";
			while (in.hasNextLine()) {
				String line = in.nextLine().toLowerCase();
				if (line.isEmpty())
					break;
				joke += line + " ";
			}
			if (joke.contains("stroud") && !name.equals("Jester"))
				fungeon.add(name);
		}
		System.out.println("Fungeon List:");
		for (String name: fungeon)
			System.out.println(name);
	}
}