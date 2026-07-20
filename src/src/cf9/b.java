package cf9;
import java.util.*;

public class b {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n= sc.nextInt();
            int k=sc.nextInt();
            if((n*n-k)!=1) {
            	System.out.println("YES");
            	for (int i=0;i<n;i++) {
            		for(int j=0;j<n;j++) {
            			if(k-->0) {
            				System.out.print("U");
            			} else if(i<n-1) {
            				System.out.print("D");
            			} else if(i==n-1 && j==n-1) {
            				System.out.print("L");
            			} else {
            				System.out.print("R");
            			}
            		}
            		System.out.println();
            	}
            }
            else {
            	System.out.println("NO");
            }
        }
        sc.close();
    }
}