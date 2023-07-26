public class Lab369 {
    public static void main(String args[]){
        Hello31 h=new Hello31();
        System.out.println(h.show(10));
    }
}
class Hello31{
    boolean show(int x){
        System.out.println("show()");
        return true;
    }
}
