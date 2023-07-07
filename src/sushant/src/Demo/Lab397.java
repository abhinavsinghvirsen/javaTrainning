package Demo;

public class Lab397 {
	public static void main(String arg[]) {
		Hai hai=new Hai();
		hai.a=99;
		
		Helloq11 h=new Helloq11();
		System.out.println("main begin:"+hai.a);
		h.m1(hai);
		System.out.println("main ends:"+hai.a);
	}
			
		}
	class Helloq11{
		void m1(Hai hai) {
			System.out.println("m1 begin:"+hai.a);
			hai.a=hai.a+10;
			System.out.println("m1 ends:"+hai.a);
		}
	}

class Hai{
	int a;
}
