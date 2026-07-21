package inf;
import java.util.Arrays;
import java.util.Scanner;

public class cf230a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++) {
			a[i][0] = scanner.nextInt();
			a[i][1] = scanner.nextInt();
		}
		Arrays.sort(a, (x, y) -> x[0] - y[0]);
		boolean f = true;
		for(int i = 0; i < n; i++) {
			if(a[i][0] < s) {
				s+=a[i][1];
			} else {
				f=false;
				break;
			}
		}
		System.out.println(f ? "YES" : "NO");
		
	}
}
