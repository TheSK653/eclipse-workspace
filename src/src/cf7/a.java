package cf7;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int k=sc.nextInt();
			int x=sc.nextInt();
			for (int i=0;i<k;i++) {
				if(x%2==0 && (x-1)%3==0) {
					x=(x-1)/3;
				}else {
					x*=2;
				}
			}
			System.out.println(x);
		}
	}
}
