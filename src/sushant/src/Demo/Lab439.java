package Demo;

public class Lab439 {
	 public static void main(String args[]) {
		 new C3ss(); 
		 }}
	  class A3ss{
		  A3ss(){
			  System.out.println("A ->D.C");
		  }
		  static {
			  System.out.println("A ->S.B");
		  }
		  {
			  System.out.println("A ->I.B");
		  }}
	  class B3ss extends A3{
		  B3ss(){
			  System.out.println("B ->D.C");
		  }
		  static {
			  System.out.println("B ->S.B");
		  }
		  {
			  System.out.println("B ->I.B");
		  }}
	  class C3ss extends B3{
		  C3ss(){
			  System.out.println("C->D.C");
		  }
		  static {
			  System.out.println("C ->S.B");
		  }
		  {
			  System.out.println("C ->I.B");
		  }
	  }
		  
		 


