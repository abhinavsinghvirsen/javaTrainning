public class Lab403 {
    public static void main(String args[]){
        Hello58 h=new Hello58();
        h.show();
    }
}
class Hello58{
    void show(int a,int...arr){
        System.out.println("\nshow(int,int...)");
    }
}