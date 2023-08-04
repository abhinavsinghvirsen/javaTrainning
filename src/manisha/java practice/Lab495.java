public class Lab495 {
    public static void main(String args[]){
        B9 bobj=new B9();
        bobj.show(99);
        bobj.show("JLC");
    }
}
class A9{
    void show(int ab){
        System.out.println("A -> show(int)");
    }
}

class B9 extends A9{
    void show(String ab){
        System.out.println("B -> show(String)");
    }
}
