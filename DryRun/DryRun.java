import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class DryRun {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt(), total = 0;
		for (int i = 0; i < lines; i++)
			total += in.nextInt();
		System.out.println(total);
		System.out.println("Mufaro Machaya, Hoang Vo, Nate Bergeron");
		System.out.println("Advanced");
		System.out.println("Cy-Fair High School");
		System.out.println("Team 16");
	}
}