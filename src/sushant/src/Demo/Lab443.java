package Demo;

public class Lab443 {
	   public static void main(String args[]) {
	    	
	    	 Hello11dd.show();
	     }}
	class Hai1dd{
		static int a=10; 
		
	}
		class Hello11dd extends Hai1dd{
			static int a=20;
		static	void show() {
				int a=30;
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(super.a);
			}
	     }



