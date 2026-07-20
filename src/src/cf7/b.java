package cf7;
import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            for(int i=0;i<n;i++) {
            	System.out.print(n-sc.nextInt()+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}