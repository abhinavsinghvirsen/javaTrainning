package Demo;

public class Lab416 {
public static void main(String[] arg) {
	System.out.println("Hello-main");
	
}
}
class Hai2{
	public static void main(String[]arg) {
		System.out.println("Hai-main");
		Hello.main(args);
	}
}