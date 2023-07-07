package Demo;

public class Lab185 {
public static void main(String arg[]) {
	char ch='A';
	if(ch>=65&&ch<=90) {
		switch(ch) {
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			System.out.println("Chcaacter is vowel");
			break;
			default:
				System.out.println("character is consonant");
		}
	}else {
		System.out.println("Invailed Alphabet");
		}
			
	}
}

