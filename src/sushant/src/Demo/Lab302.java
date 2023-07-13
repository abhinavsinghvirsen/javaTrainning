package Demo;

public class Lab302 {
	public static void main(String arg[]) {
		Hellot h=new Hellot();
		System.out.println("main:"+h.a);
	}
	}
class Hellot{
	int a;
	{
		a=10;
		System.out.println("initilized:"+a);
	}
}
