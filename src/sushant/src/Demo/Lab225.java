package Demo;

public class Lab225 {
	public static void main(String arg[]) {
		int ab=10;
		jlc:{
			System.out.println("JLC BLOCK STARTS");
			sd:{
				System.out.println("SD BLOCK STARTS");
				if(ab==10)
				break sd;
				System.out.println("SD BLOCK ENDS");
			}
			System.out.println("JLC BLOCK ENDS");
		}
			System.out.println("Completed");
		}
	}





