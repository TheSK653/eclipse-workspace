package inf;
import java.util.Scanner;

public class cf26b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int ans=0;
		int open =0;
		for(char ch :s.toCharArray()) {
			if(ch == '('){
				open++;
			}else if(open>0){
				open--;
				ans+=2;
			}
		}
		System.out.println(ans);
	}
}
