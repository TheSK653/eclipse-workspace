package inf;
import java.util.*;

public class cf189a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a=new int[3];
		a[0]=scanner.nextInt();
		a[1]=scanner.nextInt();
		a[2]=scanner.nextInt();
		Arrays.sort(a);
		int ans=0;
		for(int x:a) {
			if(n>=x) {
				n-=x;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
