package Demo;

public class Lab449 {
    public static void main(String args[]) {
    	B2g bobj=new B2g(10,"JLC");
    	bobj.show();
    }}
class A2g{
	int a;
	A2g(int a){
		System.out.println("A(int)Cons");
	}}
class B2g extends A2g{
	String a;
	B(int a1,String a2){
		super(a1);
		this.a=a2;
		System.out.println("B(int)Cons");
	}
	void show() {
		System.out.println(this.a);
		System.out.println(super.a);
    }
}
