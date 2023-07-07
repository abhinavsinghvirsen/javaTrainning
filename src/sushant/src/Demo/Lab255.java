package Demo;

public class Lab255 {
	public static void main(String arg[]) {
		int arr[]=new int[3];
		arr[0]=23;arr[1]=65;arr[2]=98;
		int arr2[]=arr;
		System.out.println("LEN:"+arr.length);
		System.out.println("LEN:"+arr2.length);
		 arr=new int[5];
		 System.out.println("LEN:"+arr.length);
		for(int i=0;i<arr.length;i++) { 
		System.out.println(arr[i]);
		}
	
		System.out.println("LEN:"+arr2.length);
		for(int i=0;i<arr2.length;i++);
		System.out.println(arr[2]);
	}

}


