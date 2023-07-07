package Demo;

public class Lab436 {
	  public static void main(String args[]) {
		  Hello41sp.show();
	  }}
  class Hai41{
	  static void show() {
		  System.out.println("Hai->show");
	  }
	  static {
		  System.out.println("Hai->show");
	  }}
     class Hello41sp extends Hai41{
    	 static {
    		 System.out.println("Hello->S.B");
	  }
}
