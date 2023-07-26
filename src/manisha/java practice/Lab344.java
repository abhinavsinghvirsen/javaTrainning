public class Lab344 {
    public static void main(String args[]){
        Hello11 h=new Hello11(99);
        h.show();
    }
}
class Hello11{
    int a;
    Hello11(){
        System.out.println("Hello DC");
    }
    Hello11(int a){
        this();
        System.out.println("Hello 1-Arg Con");
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }  
}
