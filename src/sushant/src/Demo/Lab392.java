package Demo;

public class Lab392 {
	public static void main(String arg[]) {
		Hellovxx h=new Hellovxx();		
	
		h.show(null);		
	}
}
class Hellovxx{
	void show(String str) {
		System.out.println("show(String)");
	}
	void show(Hello str) {
		System.out.println("show(Hello)");
	}
}





