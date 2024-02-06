package in.fundamental;
/**
 * Instance variable:
 * variables declared outside function without static key world
 * object is required to access instance variable.
 * syntax data_type varName = value;
 */
public class Variable {
	int data = 200;
	public static void main(String[] args) {
		// creating an object:
		//className objName = new className();
		
		Variable obj = new Variable();
		System.out.print(obj.data);
		
		Variable obj2 = new Variable();
		System.out.print("_____________________________ ");
		System.out.print("Before modifing the data ");
		System.out.print(obj.data);
		System.out.print(obj2.data);
		System.out.print("___________________");
		System.out.print("After modifing data");
		obj.data = 500;
		System.out.print(obj.data);
		System.out.print(obj2.data);
		
	}
}
