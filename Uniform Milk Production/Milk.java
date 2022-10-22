import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Milk {
	static double difference(int goat, int[] group) {
		double global_avg = Arrays.stream(group).average().getAsDouble();
		double local_avg = 0.0;
		boolean seen = false;
		for (int g: group)
			if (g == goat && !seen) {
				seen = true;
				continue;
			}
				local_avg += g;
		local_avg /= group.length;
		System.out.println("Global: " + global_avg);
		System.out.println("Local: " + local_avg);
		System.out.println("Abs: " + Math.abs(global_avg - local_avg));
		return Math.abs(global_avg - local_avg); 
	}

	static int[] sub_array(int[] arr, int from, int to) {
		int[] sub = new int[to-from];
		for (int i = from; i < to; i++)
			sub[i-from] = arr[i];
		return sub;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("sample.in.txt"));
		int test_cases = in.nextInt();
		for (int t = 0; t < test_cases; t++) {
			final int g_count = in.nextInt(), K = in.nextInt();
			int[] goats = new int[g_count];
			for (int i = 0; i < g_count; i++)
				goats[i] = in.nextInt();
			double greatest_diff_global = 0.0;
			int greatest_diff_goat = -1;
			for (int i = 0; i < g_count; i++) {
				for (int g = 0; g < g_count-K; g++) {
					int[] sub = sub_array(goats, g, g+3);
					double diff = difference(goats[i], sub);
					System.out.println(goats[i] + " -> " + Arrays.toString(sub) + " = " + diff); 
					if (diff > greatest_diff_global) {
						greatest_diff_global = diff;
						greatest_diff_goat = goats[i];
					}
				}
			}
			System.out.println(greatest_diff_goat);
		}
	}
}