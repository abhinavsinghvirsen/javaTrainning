package Demo;

public class Lab309 {
	public static void main(String arg[]) {
	System.out.println("main:"+Hellocc.a);
	}
}
class Hellocc{
	static int a;
	 int b;
	static {
		a=10;
		b=20;

		System.out.println("static block");
	}
}



