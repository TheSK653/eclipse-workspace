package cf8;
import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			char[] charArray =sc.next().toCharArray();
			int zs=0;
			for (char a:charArray) {
				if(a=='0')
					zs++;
			}
			int zr=0;
			for(int i=zs;i<n;i++) {
				if(charArray[i]=='0')
					zr++;
			}
			System.out.println(zr);
		}
	}
}
