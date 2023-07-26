public class Lab433 {
    public static void main(String args[]){
        new Hello72();
    }
}
class Hai13{
    int a=99;
    {
        System.out.println("Hai ->I.B:"+a);
    }
}
class Hello72 extends Hai13{
    int b=88;
    {
        System.out.println("Hello ->I.B:"+a);
        System.out.println("Hello ->I:B:"+b);
    }
}

