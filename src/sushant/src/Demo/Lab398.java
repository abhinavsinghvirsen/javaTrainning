package Demo;

public class Lab398 {
	public static void main(String arg[]) {
		Hai1 hai=new Hai1();
		hai.a=99;
		
		Helloq111 h=new Helloq111();
		System.out.println("main begin:"+hai.a);
		h.m1(hai);
		System.out.println("main ends:"+hai.a);
	}
			
		}
	class Helloq111{
		void m1(Hai1 hai) {
			System.out.println("m1 begin:"+hai.a);
			hai=new Hai1();
			hai.a=hai.a+10;
			System.out.println("m1 ends:"+hai.a);
		}
	}

class Hai1{
	int a;
}


