package Demo;

public class Lab386 {
	public static void main(String arg[]) {
		Hellov1 h=new Hellov1();
		byte b=20;
		h.add(10,b);
		h.add(b,b);
	}
}
class Hellov1{
	void add(int a,byte b) {
		System.out.println("add(int,byte)");
	}
}