package Demo;

public class Lab288 {
	public static void main(String arg[]) {
		Hello3 h1=new Hello3();
		Hello3 h2=new Hello3();
		System.out.println(h1.a+"\t"+h2.a);
		h1.a=99;
		System.out.println(h1.a+"\t"+h2.a);
	}
	}
class Hello3{
	int a;
	
}
