package Demo;

public class Lab382 {
public static void main(String arg[]) {
	Helloc1 h=new Helloc1();
	int a=h.add(10,20);
	System.out.println(a);
	h.add(10,20);
		}
}
   class Helloc1{
	   int add(int a,int b) {
		   System.out.println("add(int,int)");
		   return a+b;
	   }
		   void add(int a,int b)
		   System.out.println("add(int,int)");
	   }
	   
   }

