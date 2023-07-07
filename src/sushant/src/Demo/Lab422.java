package Demo;

public class Lab422 {
public static void main(String args[]) {
	C1 cobj=new C1();
	cobj.m1();
	cobj.m2();
	cobj.m3();
}
}
   class A1{
	   void m1() {
		   System.out.println("A->m1");
	   }
   }
   class B1 extends A1{
	   void m2() {
		   System.out.println("B->m2");
	   }
   }
   class C1 extends B1{
	   void m3() {
		   System.out.println("C->m3");
		   
	
}
}
