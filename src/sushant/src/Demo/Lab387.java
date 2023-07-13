package Demo;

public class Lab387 {
	public static void main(String arg[]) {
		Hellov11 h=new Hellov11();
		byte b=20;
		h.add(b,10);
		h.add(b,b);
	}
}
class Hellov11{
	void add(byte a,int b) {
		System.out.println("add(byte,int)");
	}
}

