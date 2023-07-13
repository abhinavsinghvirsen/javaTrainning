package Demo;

public class Lab440 {
public static void main(String args[]) {
	Hello00001 h=new Hello00001();
	
	h.show();
}}
class Haixp{


	int a=10;
}
	class Hello00001 extends Haixp{
		int a=20;
		 void show() {
			int a=30;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
}

