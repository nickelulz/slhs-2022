import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Counterfeit {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int test_cases = in.nextInt();
		for (int t = 0; t < test_cases; t++) {
			int c = in.nextInt();
			int l = in.nextInt();
			in.nextLine();
			char[][] prev_design = null;
			int counterfeit_pos = 0;
			for (int line = 0; line < c; line++) {
				char[][] design = new char[l][0];
				for (int i = 0; i < l; i++)
					design[i] = in.nextLine().toCharArray();
				if (prev_design == null)
					prev_design = design;
				if (!Arrays.deepEquals(prev_design, design)) {
					counterfeit_pos = line+1;
					break;
				}
			}
			System.out.println("Sir, coin " + counterfeit_pos + " is a counterfeit!");
		}
	}
}