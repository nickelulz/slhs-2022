import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Money {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		for (int i = 0; i < lines; i++) {
			int total = in.nextInt();
			int[] bills = new int[7];
			while (total > 0) {
				if (total >= 1000) {
					bills[0]++;
					total -= 1000;
				} else if (total >= 100) {
					bills[1]++;
					total -= 100;
				} else if (total >= 50) {
					bills[2]++;
					total -= 50;
				} else if (total >= 20) {
					bills[3]++;
					total -= 20;
				} else if (total >= 10) {
					bills[4]++;
					total -= 10;
				} else if (total >= 5) {
					bills[5]++;
					total -= 5;
				} else if (total >= 1) {
					bills[6]++;
					total--;
				}
			}
			System.out.println(Arrays.toString(bills).replace("[", "").replace("]","").replace(", ",":"));
		}
	}
}