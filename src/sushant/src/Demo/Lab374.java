package Demo;

public class Lab374 {
public static void main(String arg[]) {
	Helloz1 h=new Helloz1();
	System.out.println(h.show());
	}
}
class Helloz1{
	int show(int x) {
		System.out.println("show()");
		return x+1;
	}
}