package Demo;

public class Lab341 {
	public static void main(String arg[]) {
		Hellocs h=new Hellocs();
		h.show();
	}
	}
	class Hellocs{
		int a=10;
		static int b=20;
		
		void show(){
			String a="jlc";
			String b="SD";
			System.out.println(a);
			System.out.println(b);
			System.out.println(this.a);
			System.out.println(this.b);
		}
	}


