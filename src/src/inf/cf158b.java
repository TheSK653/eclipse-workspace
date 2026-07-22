package inf;
import java.util.Scanner;

public class cf158b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int one=0,two=0,three=0,four=0;
		for(int i=0;i<n;i++) {
			int a=scanner.nextInt();
			if(a==1) one++;
			else if(a==2) two++;
			else if(a==3) three++;
			else if(a==4) four++;
		}
		int ans=four+three+two/2;
		one-=three;
		if(two%2!=0) {
			ans++;
			if(one>0)
			one-=2;
		}
		if(one>0) {			
			ans+=one/4;
			if(one%4!=0) ans++;
		}
		System.out.println(ans);
	}
}
