package Demo;

public class Lab316 {
	public static void main(String arg[]) {
		Hellodc h=new Hellodc();
		System.out.println("main:"+h.a);
	}}

	class Hellodc{
	 int a=10;
	 {
		 System.out.println("l.block1:"+a);
	 }
	 {
		
			System.out.println("l.block:"+a);
			
	}


}



