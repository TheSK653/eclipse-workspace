package LambdaExpression;

public abstract class InterfImpl implements Interf2{
//	@Override
//	public void m1() {
//		System.out.println("Hello World");	
//	}
//	@Override
	public void even(int i) {
		if(i%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
