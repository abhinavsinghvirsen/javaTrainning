public class Lab374 {
    public static void main(String args[]){
        Hello36 h=new Hello36();
        System.out.println(h.show());
    }
}
class Hello36{
    int show(int x){
        System.out.println("show()");
        return x+1;
    }
}
