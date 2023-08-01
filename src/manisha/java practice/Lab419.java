public class Lab419 {
    public static void main(String args[]){
        Hai5 hai=new Hai5();
        System.out.println(hai.a);
        // System.out.println(hai.b);

        Hello66 hello=new Hello66();
        System.out.println(hello.a);
        System.out.println(hello.b);
    }
}
class Hai5{
    int a=99;
}
class Hello66 extends Hai5{
    int b=88;
}
