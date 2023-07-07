package Demo;

public class Lab177 {
	public static void main(String arg[]) {
		course c=course.CORE;
		switch(c) {
		case ADV:
			System.out.println("100% placement gurantee");
		case CORE:
		System.out.println("no placement gurantee");	
		}
	}

}
enum course{
	CORE,ADV;
}