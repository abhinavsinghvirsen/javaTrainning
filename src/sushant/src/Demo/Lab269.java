package Demo;

public class Lab269 {
public static void main(String arg[]) {
		
		show(new int[4] {99,88,77,66});
	}
	static void show(int arr[]) {
		
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);//cannot define dimension when an array initializer is provided
		}
	

}



