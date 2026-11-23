import java.util.Scanner;

public class multiply3int {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		boolean neg=a<0 ^ b<0 ^ c<0;
		a=Math.abs(a);
		b=Math.abs(b);
		c=Math.abs(c);
		if(a==0 || b==0 
				|| c==0
				) {
			System.out.println(0);
			return;
		}
		long ans=0;
		while(b>0) {
			if(b%2==1) {
				ans+=a;
			}
			a+=a;
			b/=2;
		}
		a=ans;
		ans=0;
		while(c>0) {
			if(c%2==1) {
				ans+=a;
			}
			a+=a;
			c/=2;
		}
		if(neg) {
			ans=-ans;
		}
		System.out.println(ans);
	}
}
