package Demo;

public class Lab294 {
	public static void main(String args[]) {
		Hellos h1=new Hellos();
		Hellos h2=new Hellos();
		System.out.println(h1.b+"\t"+h2.b);
		h1.b=99;
		System.out.println(h1.b+"\t"+h2.b);
	}
	}
class Hellos{
	static int b;
}



