public class Lab277 {
    public static void main(String arg[]){
        int arr[][]=null;
        arr=new int[3][2];
        arr[0][0]=10; arr[0][1]=20;
        arr[1][0]=30; arr[1][1]=40;
        arr[2][0]=50; arr[2][1]=60;
        System.out.println("Using Normal For Loop");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nUsing Enhanced for loop");
        for(int ar[]:arr){
            for(int a : ar){
                System.out.print("\t"+a);
            }
            System.out.println();
        }
    }
}
