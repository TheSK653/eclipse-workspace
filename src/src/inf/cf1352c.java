package inf;
import java.util.*;

public class cf1352c {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int x=(k-1)/(n-1);
			System.out.println(k+x);
		}
	}
}
//1 2 3, 4, 5 6 7, 8, 9 10 11, 12, 13 14 15, 16