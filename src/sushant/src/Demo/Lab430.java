package Demo;

public class Lab430 {
	  public static void main(String args[]) {
		  System.out.println(Hello.a);		
	  }}
class Hai00{
	static {
		System.out.println("Hai->S.B");
	}}
class Hello001 extends Hai00{
	static int a=99;
    static {
    	System.out.println("Hello->S.B");
		
	}
}
