package inf;
import java.util.Scanner;
import java.util.Stack;

public class cf343b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		System.out.println(stack.isEmpty() ? "Yes" : "No");
	}
}
