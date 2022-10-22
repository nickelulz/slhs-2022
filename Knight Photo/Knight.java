import java.util.*;
import java.io.*;
import static java.lang.System.*;

class K {
	int w, h;
	K(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public String toString() {
		return w + " " + h;
	}
}

public class Knight {
	public static boolean check(K i, K j) {
		if (i == j)
			return false;
		// System.out.println(i + " -> " + j);
		if (i.h > j.h && i.w > j.w)
			return true;
		if (i.w > j.h && i.h > j.w)
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		ArrayList<K> knights = new ArrayList<>();
		int lines = in.nextInt();
		for (int l = 0; l < lines; l++)
			knights.add(new K(in.nextInt(), in.nextInt()));
		for (int i = 0; i < knights.size(); i++) {
			boolean can_stand = false;
			for (int j = 0; j < knights.size(); j++)
				if (check(knights.get(i), knights.get(j)))
					can_stand = true;
			System.out.println(can_stand ? "YES" : "NO");
		}
	}
}