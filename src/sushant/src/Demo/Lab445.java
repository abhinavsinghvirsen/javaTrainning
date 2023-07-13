package Demo;

public class Lab445 {
     public static void main(String args[]) {
    	 new B32();
     }}
class A32{
	A32(int a){
		System.out.println("A(int)Cons");
	}}
class B32 extends A32{
	B32(){
		super();
		System.out.println("B ->D.C");
		
     }
}
