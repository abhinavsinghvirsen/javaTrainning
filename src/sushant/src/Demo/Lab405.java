package Demo;

public class Lab405 {
	public static void main(String arg[]) {
		Hello3www h1=new Hello3www();
	h1.m1();
	
}
class Hello3www{
	void m1(int...a) {
		System.out.println("m1(int...)");
	}
	void m1(String...a) {
		System.out.println("m1(String...)");
		
	}
	}
}

