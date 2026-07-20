package cf10;
import java.util.*;

public class b {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n= sc.nextInt();
            int k=sc.nextInt();
            String s =sc.next();
            int a=0,b=0,c=0;
            for (int i=0;i<k;i++) {
            	if (s.charAt(i)=='0') a++;
            	else if (s.charAt(i)=='1') b++;
            	else c++;
            }
            boolean f=c==(n-a-b);
            String[] ans=new String[n];
            int i=0,j=n-1;
            while(a-->0) {
            	ans[i]="-";
            	i++;
            }
            while(b-->0) {
            	ans[j]="-";
            	j--;
            }
            if(f) {
            	while(c-->0) {
            		ans[i]="-";
            		i++;
            	}
            }
            else while(c-->0) {
            	ans[i]="?";
            	ans[j]="?";
            	i++;j--;
            }
            for (String e:ans) {
            	if(e==null)
            		System.out.print("+");
            	else
            		System.out.print(e);
            }
            System.out.println();
        }
        sc.close();
    }
}