package Demo;

public class Lab421 {
	  public static void main(String arg[]) {
	    	Hello1aaa hello=new Hello1aaa();
	    	hello.m1();
	    	hello.m2();
	    }
	}
	  class Hai1aa{
		  int a=99;
		  void m1() {
			  System.out.println("Hai->m1:"+a);
			 
		  }
	  }
	  class Hello1aaa extends Hai1aa{
		  int b=88;
		  void m2(){
		System.out.println("Hello->m2:"+a);
		System.out.println("Hello->m2:"+b);
		
	    }
	}


