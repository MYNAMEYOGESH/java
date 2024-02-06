package in.fundamental;
/**
 * 
 * Local Variable 
 * variables declared inside a function 
 * Local Variable  can be access inside the function only 
 */

public class Variable_III {
	public void m1() {
		int a = 10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		
		Variable_III obj = new Variable_III();
		// System.out.print(obj.a);
		//System.out.println(Variable_III.a);
		obj.m1();
		
	}
	

}
