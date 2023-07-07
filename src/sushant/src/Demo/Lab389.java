package Demo;

public class Lab389 {
	public static void main(String arg[]) {
		Hellov1111 h=new Hellov1111();
		byte b=20;
		h.add(b,b);
		
	}
}
class Hellov1111{
	void add(byte a,int b) {
		System.out.println("add(byte,int)");
	}
	void add(int a,byte b) {
		System.out.println("add(int,byte)");
	}
}




