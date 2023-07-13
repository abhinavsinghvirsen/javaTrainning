package Demo;

public class Lab373 {
	public static void main(String arg[]) {
		Hellon2222 h=new Hellon2222();	
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));
		}
		}
		class Hellon2222{
			boolean isdigits(char ch) {
		System.out.println("isDigit():"+ch);
		if(ch>=48&&ch<=57)
			return true;
		else
			return false;
	
			}
		}





