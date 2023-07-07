package Demo;

public class Lab384 {
	public static void main(String arg[]) {
		Helloc111 h=new Helloc111();
		int a=h.add(10,20);
		System.out.println(a);
	String b=h.add("jlc",99);
		System.out.println(b);
			}
	}
	   class Helloc111{
		   int add(int a,int b) {
			   System.out.println("add(int,int)");
			   return a+b;
		   }
			   String add(String a,int b) {
			   System.out.println("add(String,int)");
			   return a+b;
		   }
		   
	   }





