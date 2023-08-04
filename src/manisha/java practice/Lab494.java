public class Lab494 {
    public static void main(String args[]){
        B8 bobj=new B8();
        bobj.show();
        bobj.SHOW();
    }
}
class A8{
    void show(){
        System.out.println("A -> show()");
    }
}

class B8 extends A8{
    void SHOW(){
        System.out.println("B -> SHOW()");
    }
}