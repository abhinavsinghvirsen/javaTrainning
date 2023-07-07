package Demo;

public class Lab322 {
	public static void main(String arg[]) {
		System.out.println("\n Main:"+Helloza.a);
	}
	}
class Helloza{
	static int a;
	{
		System.out.println("\n i am llb");
		{
			System.out.println("i am local block in llb");
		}
	}
	static {
		System.out.println("\n i am sbi");
	}
	}
	

