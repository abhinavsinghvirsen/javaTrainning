package Demo;

public class Lab442 {
     public static void main(String args[]) {
    	 Hello11d h=new Hello11d();
    	 h.show();
     }}
class Hai1d{
	static int a=10; 
	
}
	class Hello11d extends Hai1d{
		static int a=10;
		void show() {
			int a=30;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
     }

