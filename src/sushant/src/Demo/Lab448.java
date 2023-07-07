package Demo;

public class Lab448 {
	public static void main(String args[]) {
		new B2w(10);
	}}
class A2w{
	A2w(){
		System.out.println("A ->D.C");
	}}
class B2w extends A2w{
	B2w(){
		System.out.println("B ->D.C");
	}
	B2w(int a){
		this();
		System.out.println("B(int)");
	}
}
