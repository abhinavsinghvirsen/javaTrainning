package Demo;

public class Lab326 {
	public static void main(String arg[]) {
		System.out.println("i am main()");
		{
			int a=10;
			System.out.println("i am local block 1 in main():"+a);
		}
		{
			int a=20;
			System.out.println("i am local block 2 in main():"+a);
		}
		{
			String a="JLC";
			System.out.println("i am local block 1 in main():"+a);
		}
	}

}
