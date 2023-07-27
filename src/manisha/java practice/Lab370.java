public class Lab370 {
    public static void main(String args[]){
        Hello32 h=new Hello32();
        System.out.println(h.show(10));
    }
}
class Hello32{
    boolean show(int x){
        System.out.println("show()");
        return 0;
    }
}
