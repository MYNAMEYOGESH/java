package in.fundamental;

public class Method_I {
	
	public static void m1() {
		System.out.println("static method execution");
	}

	public static void m2() {
		System.out.println("Non-static method execution");
		return;
	}
	
	public int m3(){
		m4();
		return 10;
		
	}
	public static void m4() {
		System.out.println("hello");
	}


}
