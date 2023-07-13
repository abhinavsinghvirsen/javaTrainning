package Demo;

public class Lab441 {
	public static void main(String args[]) {
		Hello000001 h=new Hello000001();
		
		h.show();
	}}
	class Haixpp{}
	
	class Hello000001 extends Haixpp{
			int a=20;
			 void show() {
				int a=30;
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(super.a);
			}
	}



