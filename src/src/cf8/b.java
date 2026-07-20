package cf8;
import java.util.*;

public class b {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            
            long s10p = 10;
            while (s10p <= x) {
                s10p *= 10;
            }
            if(s10p!=1000000000)s10p*=10;
            long y = s10p - 1 - x;
            System.out.println(y);
        }
        sc.close();
    }
}