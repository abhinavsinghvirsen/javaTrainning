package Demo;

public class Lab390 {
	public static void main(String arg[]) {
		Hellov11111 h=new Hellov11111();
		h.show(null);
		h.show("jlc");
		h.show(h);
		
	}
}
class Hellov11111{
	void show(String str) {
		System.out.println("show(String)");
	}
	void show(object str) {
		System.out.println("show(object)");
	}
}






