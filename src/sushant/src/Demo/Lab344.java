package Demo;

public class Lab344 {
	public static void main(String arg[]) {
		Hello00 h=new Hello00(99);
		h.show();
	}
}
class Hello00{
	int a;
	Hello00(){
		System.out.println("Hello DC");
	}
	Hello00(int a){
		this();
		System.out.println("Hello 1-Arg con");
		this.a=a;
	}
		void show() {
			System.out.println(a);
		}
	}


