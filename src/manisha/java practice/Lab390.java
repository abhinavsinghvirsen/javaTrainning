public class Lab390 {
    public static void main(String args[]){
        Hello48 h=new Hello48();
        h.show(null);
        h.show("JLC");
        h.show(h);
    }
}
class Hello48{
    void show(String str){
        System.out.println("show(String)");
    }
    void show(Object str){
        System.out.println("show(Object)");
    }
}
