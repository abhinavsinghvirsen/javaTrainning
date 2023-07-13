package Demo;

public class Lab404 {
	public static void main(String arg[]) {
		Hello3ww h=new Hello3ww();
	h.show(10);
	h.show(10,20);
	h.show(10,20,30);
	}
}
class Hello3ww{
	void show(int a,int...arr) {
		System.out.println("\nshow(int,int...)");
	}
}