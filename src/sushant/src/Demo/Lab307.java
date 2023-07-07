package Demo;

public class Lab307 {
	public static void main(String arg[]) {
	Hellov h=null;
	System.out.println("Ref created");
	h=new Hellov();
	}}
class Hellov{
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
}




