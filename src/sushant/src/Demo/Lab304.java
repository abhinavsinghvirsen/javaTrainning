package Demo;

public class Lab304 {
	public class Lab303 {
		public static void main(String arg[]) {
			
			System.out.println("main:"+Helloj.a);
		}
		}
	class Helloj{
		static int a;
		static {
			a=10;
			System.out.println("initilized:"+a);
		}
	}



}
