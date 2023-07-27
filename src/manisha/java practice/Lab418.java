public class Lab418 {
    public static void main(String args[]){
        Hai4 hai=new Hai4();
        System.out.println(hai.a);
        System.out.println(hai.b);

        Hello65 hello=new Hello65();
        System.out.println(hello.a);
        System.out.println(hello.b);
    }
}
class Hai4{
    int a=99;
}
class Hello65 extends Hai4{
    int b=88;
}
