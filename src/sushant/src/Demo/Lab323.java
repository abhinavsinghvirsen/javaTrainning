package Demo;

public class Lab323 {
	public static void main(String arg[]) {
		new Hellozaa();
		System.out.println("\n** Hello guys");
	}
	}
class Hellozaa{
	static int a;
	{
		System.out.println("\n i am llb");
		{
			System.out.println("i am local block in llb");
		}
	}
	static {
		System.out.println("\n i am sbi");
		{
			System.out.println("i am local block in sbi");
		}
	}
	


}
