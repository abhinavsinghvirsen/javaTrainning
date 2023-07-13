package Demo;
class Hello1{
	char ch;
	void show() {
		System.out.println(ch==0);
		System.out.println(ch=='');
		System.out.println(ch=='\u0000');
	}
}
public class Lab2 {
	public static void main(String arg[]) {
	Hello h=new Hello();
	h.show();
}

}