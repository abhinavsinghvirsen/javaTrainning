package Demo;

public class lab407 {
	public static void main(String arg[]) {
	Hello4ww h=new Hello4ww();
	h.show(10);
	}
}
class Hello4ww{
	void show(int...arr1) {
		System.out.println("\nshow(int...)");
	}
	void show(int[]arr1) {
	System.out.println("\nshow(int[])");
	
}

}
