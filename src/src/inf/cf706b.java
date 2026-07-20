package inf;
import java.util.*;

public class cf706b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int q = scanner.nextInt();
		while(q-- > 0) {
			int x = scanner.nextInt();
			int l = 0, r = n;
			int ans = 0;
			while(l <= r) {
				int m = (l + r) / 2;
				if(a[m] <= x) {
					ans=m;
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
			System.out.println(ans);
		}
	}
}
