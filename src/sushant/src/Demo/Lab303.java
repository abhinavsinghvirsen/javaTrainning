package Demo;

public class Lab303 {
	public static void main(String arg[]) {
		
		System.out.println("main:"+Hellox.a);
	}
	}
class Hellox{
	static int a;
	{
		a=10;
		System.out.println("initilized:"+a);
	}
}



