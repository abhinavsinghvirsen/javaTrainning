package Demo;

public class lab388 {
	public static void main(String arg[]) {
		Hellov111 h=new Hellov111();
		byte b=20;
		h.add(b,10);
		h.add(10,b);
	}
}
class Hellov111{
	void add(byte a,int b) {
		System.out.println("add(byte,int)");
	}
	void add(int a,byte b) {
		System.out.println("add(int,byte)");
	}
}



