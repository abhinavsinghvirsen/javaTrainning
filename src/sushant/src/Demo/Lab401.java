package Demo;

public class Lab401 {
	public static void main(String arg[]) {
		Hellozz12 h=new Hellozz12();
	h.sum(new int[0]);
	h.sum(new int[] {12,34,43});
	h.sum(new int[] {10,20,50,30 });
	}

}
class Hellozz12{
	void sum(int arr[]) {
		System.out.println("--sum(int[]");
		System.out.println("Length:"+arr.length);
		int s=0;
		for(int a:arr) {
			s=s+a;
		}
		System.out.println("sum is:"+s);
		}
	}
