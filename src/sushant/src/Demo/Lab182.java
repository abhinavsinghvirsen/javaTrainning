package Demo;

public class Lab182 {
public static void main(String arg[]) {
//int a=45;
final int a=20;
switch(a) {
case 10:
	System.out.println("ten");
case 20:
	System.out.println("twenty");
case 'A':
	System.out.println("char-A");
case 10+20+15:
	System.out.println("constant expression");

default:
	System.out.println("default");
	
}
}
}
