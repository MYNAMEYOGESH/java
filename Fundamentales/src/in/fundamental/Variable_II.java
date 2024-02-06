package in.fundamental;
/**
 * Static variable:
 * variables declared outside the function with static key world
 * calssName/object is required to access instance variable.
 * static variable get initialized during class load
 * syntax: static data_type varName = value;
 * every object share the common copy of static data
 */
public class Variable_II {
	static int data = 500;
	public static void main(String[] args) {
		//using className:
		System.out.println(Variable_II.data);
		
		//using object:
		Variable_II obj1 = new Variable_II();
		System.out.println(obj1.data);
		
		Variable_II obj2 = new Variable_II();
		System.out.print("Before modifing the data ");
		System.out.print(obj1.data);
		System.out.print(obj2.data);
		
		System.out.print("___________________");
		System.out.print("After modifing data");
		obj1.data = 1000;
		System.out.print(obj1.data);
		System.out.print(obj2.data);

	}

}
