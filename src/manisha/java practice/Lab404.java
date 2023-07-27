public class Lab404 {
    public static void main(String args[]){
        Hello59 h=new Hello59();
        h.show(10);
        h.show(10,20);
        h.show(10,20, 30);
    }
}
class Hello59{
    void show(int a,int...arr){
        System.out.println("\nshow(int,int...)");
    }
}
