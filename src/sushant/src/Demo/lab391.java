package Demo;

public class lab391 {
	public static void main(String arg[]) {
		Hellovx h=new Hellovx();		
		h.show("jlc");
		h.show(h);		
	}
}
class Hellovx{
	void show(String str) {
		System.out.println("show(String)");
	}
	void show(Hello str) {
		System.out.println("show(Hello)");
	}
}



