package LambdaExpression;

import java.util.function.*;

public class MainClass {
	
	public static void main(String[] args) {
//		Interf i = new InterfImpl();
//		Interf i = () -> System.out.println("Hello, i am samarth");
//		Interf i = (n)-> System.out.println(n);
//		Interf i = (a,b) -> System.out.println(a+b);
//		i.sum(40,50);  
		
//		Interf i = new InterfImpl();
		
//		Interf i = (n) -> {
//			if (n%2 == 0) System.out.println(true);
//			else System.out.println(false);
//			};
//		i.even(5);
		
		//Functional Interface
		// Function<Input, Output> and the apply function used 
		// 1. Function<Integer,Integer> return Integer
		// 2. Function<String,Integer> return Integer
		// 3. Function<Integer,Boolean> return Boolean
		
		// Predicate<Input> and test function used for output 
		// Predicate Returns only Boolean Only
		
		Predicate<Integer> p = (n) -> n%2 == 0; // predicate returns boolean
		System.out.println(p.test(3));
		
		Function<String, Integer> q = (s) -> s.length(); // Function returns String
		System.out.println(q.apply("samarth"));
		
		BinaryOperator<Integer> r = (a,b) -> a/b; // binary opeartor used for 2 inputs return integer
		System.out.println(r.apply(10,3));
		
		// biFunction have more 2 input with output field
		BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b;  
		System.out.println(divide.apply(10, 3));
		
	}
}