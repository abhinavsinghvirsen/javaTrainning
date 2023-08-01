public class Lab386 {
    public static void main(String args[]){
        Hello46 h=new Hello46();
        byte b=20;
        h.add(10,b);
        h.add(b,b);
    }
}
class Hello46{
    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}