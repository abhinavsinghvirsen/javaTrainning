public class Lab407 {
    public static void main(String args[]){
        Hello62 h=new Hello62();
        h.show(10);
    }
}
class Hello62{
    void show(int...arr1){
        System.out.println("\nshow(int...)");
    }
    void show(int[]arr1){
        System.out.println("\nshow(int[] )");
    }
}
