package Demo;

public class Lab394 {
		
		public static void main(String arg[]) {
			int x=98;
			System.out.println("main begins:"+x);
			new Hello3w().m1(x);
			System.out.println("main ends:"+x);
		}
}
			class Hello3w{
				void m1(int x) {
					System.out.println("m1 begins:"+x);
					if(x!=0)
						m1(x/10);
					System.out.println("m1 ends:"+x);
				}
		}
		
	


