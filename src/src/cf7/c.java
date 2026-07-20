package cf7;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            
            long c;
            
            if(b%2==0) {
            	c=a*b/2+2;
            }else {
            	c=a*b+1;
            }
            if(c%2==0) {
            	System.out.println(c);
            }else {
            	System.out.println(-1);
            }
        }
        sc.close();
	}

}
