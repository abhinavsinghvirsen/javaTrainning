package Demo;

public class Lab372 {
	public static void main(String arg[]) {
		Hellon222 h=new Hellon222();
	
			System.out.println(h.isDigit('A'));
			System.out.println(h.isDigit('8'));
		}
		}
		class Hellon222{
			boolean isdigits(char ch) {
		System.out.println("isDigit():"+ch);
		boolean b=ch>=48&&ch<=57;
			return b;
	
			}
		}



