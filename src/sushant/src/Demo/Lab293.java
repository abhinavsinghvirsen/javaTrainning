package Demo;

public class Lab293 {
	public static void main(String arg[]) {
		Helloa h=new Helloa();
		System.out.println(h.b);
		h.b=99;
		System.out.println(h.b);
	}
	}
class Helloa{
	static int b;
}
