package Demo;

public class Lab375 {
	public static void main(String arg[]) {
		Helloz11 h=new Helloz11();
		System.out.println(h.show(10,20));
		}
	}
	class Helloz11{
		int show(int x) {
			System.out.println("show()");
			return x+1;
		}
	}

