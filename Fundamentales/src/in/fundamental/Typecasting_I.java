package in.fundamental;

public class Typecasting_I {
	
	public static void main(String[] args) {
		//implicit type-casting
		
		byte a = 100;
		int b = a;
		
		System.out.println(a+" "+b);
		
		//Explicit type-casting
		
				int c = 100;
				byte d = (byte)c;
				
				System.out.println(c+" "+d);
				
				//data loss
				
				int x = 150;
				byte y = (byte)a;
				
				System.out.println(x+" "+y);
	}

}
