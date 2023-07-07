package Demo;

public class Lab396 {
public static void main(String arg[]) {
	int a=99;
	Helloq1 h=new Helloq1();
	System.out.println("main begin:"+a);
	h.m1(a);
	System.out.println("main ends:"+a);
}
		
	}
class Helloq1{
	void m1(int a) {
		System.out.println("m1 begin:"+a);
		a=a+10;
		System.out.println("m1 ends:"+a);
	}
}
