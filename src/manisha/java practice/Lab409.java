class Lab409{
    public static void main(String args[]){
        Hello63 h=new Hello63();
        h.show();
        int arr1[]=new int[]{10};
        int arr2[]=new int[]{20,30,12};
        h.show(arr1,arr2);
    }
}
class Hello63{
    void show(int[]...arr){
        System.out.println("\nshow(int[]...)");
    }
}