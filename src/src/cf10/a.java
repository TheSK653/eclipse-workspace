package cf10;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt()%3;
			if(n==0)
				System.out.println(0);
			else 
				System.out.println(3-n);
		}
	}
}
