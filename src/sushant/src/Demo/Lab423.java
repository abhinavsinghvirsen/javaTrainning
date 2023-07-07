package Demo;

public class Lab423 {
	public static void main(String args[]) {
		B12 bobj=new B12();
		bobj.m1();
		bobj.m2();
		C12 cobj=new C12();
		cobj.m1();
		cobj.m2();
	}
}
class A12{
	void m1() {
		System.out.println("A->m1");
	}
}
class B12{
	void m2() {
		System.out.println("B->m2");
	}
}
class C12 extends A12{
	void m3() {
		System.out.println("C->m3");
	}
}
