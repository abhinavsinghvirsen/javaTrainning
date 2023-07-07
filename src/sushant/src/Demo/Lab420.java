package Demo;

public class Lab420 {
    public static void main(String arg[]) {
    	Hello1aa hello=new Hello1aa();
    	hello.m1();
    	hello.m2();
    }
}
  class Hai1a{
	  int a=99;
	  void m1() {
		  System.out.println("Hai->m1:"+a);
		  System.out.println("Hai->m1:"+b);
	  }
  }
  class Hello1aa extends Hai1a{
	  int b=88;
	  void m2(){
	System.out.println("Hello->m2:"+a);
	System.out.println("Hello->m2:"+b);
	
    }
}
