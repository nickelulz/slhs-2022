import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Royal {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("sample.in.txt"));
		int minions = in.nextInt();
		int coinNeeded = in.nextInt();
		int time =0;
		ArrayList<Integer> sTime = new ArrayList<>();
		ArrayList<Integer> bSize = new ArrayList<>();
		ArrayList<Integer> cTime = new ArrayList<>();
		for (int m = 0; m<minions; m++){
			sTime.add(in.nextInt());
			bSize.add(in.nextInt());
			cTime.add(in.nextInt());
		}
		while(coinNeeded != 0){
			int second =0;
			for (int i =0; i<minions; i++){
				if (second >= sTime.get(i)){
					if (second % cTime.get(i) == 0)
					coinNeeded -= bSize.get(i);
					time++;
				}
				else
					second++;
			}
		}
		System.out.println(time);
	}
}