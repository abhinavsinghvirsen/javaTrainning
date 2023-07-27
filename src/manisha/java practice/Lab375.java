public class Lab375 {
    public static void main(String args[]){
        Hello37 h=new Hello37();
        System.out.println(h.show(10,20));
    }
}
class Hello37{
    int show(int x){
        System.out.println("show()");
        return x+1;
    }
}
