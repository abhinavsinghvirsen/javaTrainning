package Demo;

public class Lab402 {
	public static void main(String arg[]) {
		Hellozz123 h=new Hellozz123();
	h.sum(new int[0]);
	h.sum(new int[] {12,34,54});
	h.sum(new int[] {10,20,50,30 });
	h.sum();
	h.sum(12,34,54);
	h.sum(10,20,50,30);
	
	}

}
class Hellozz123{
	void sum(int... arr) {
		System.out.println("--sum(int...)");
		System.out.println("Length:"+arr.length);
		int s=0;
		for(int a:arr) {
			s=s+a;
		}
		System.out.println("sum is:"+s);
		}
	}


