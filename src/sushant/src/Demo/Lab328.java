package Demo;

public class Lab328 {
	public static void main(String arg[]) {
		System.out.println("i am main()");
		{
			int a=10;
			System.out.println("i am local block 1 in main():"+a);
		}
		
			int a=90;
			System.out.println("i am local block 2 in main():"+a);
		}
	}