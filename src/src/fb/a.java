package fb;

import java.util.*;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int c=0;
		while(c++<t) {
			int n=sc.nextInt();
			List<Integer> A=new ArrayList<>();
			List<Integer> B=new ArrayList<>();
			 	
			for (int i=0;i<n;i++)
				A.add(sc.nextInt());
			
			int x=0;
			
			for (int i=0;i<n;i++) {
				B.add(sc.nextInt());
				if(x==-1) continue;
				else if(A.get(i)<B.get(i))  {
					if(A.contains(B.get(i))) x++;
					else x=-1;
				}
				else if(A.get(i)>B.get(i)) x=-1;
			}
			System.out.println("Case #"+c+": "+x);
			if(x!=-1)
			for (int i=0;i<n;i++) {
				if(A.get(i)<B.get(i))
				System.out.println(A.indexOf(B.get(i))+1+" "+(i+1));
			}
		}
	}
}
