public class Lab443 {
    public static void main(String args[]){
        Hello78.show();
    }
}
class Hai20{
    static int a=10;
}
class Hello78 extends Hai20{
    static int a=20;
    static void show(){
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
