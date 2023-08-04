public class Lab444 {
    public static void main(String args[]){
        Hello79.show();
    }
}
class Hai21{
    static int a=10;
}
class Hello79 extends Hai21{
    static int a=20;
    static void show(){
        int a=30;
        System.out.println(a);
        System.out.println(Hello78.a);
        System.out.println(Hai21.a);
    }
}
