public class Lab429 {
    public static void main(String args[]){
        new Hello69();
    }
}
class Hai9{
    static int a=99;
    static{
        System.out.println("Hai ->S.B:"+a);
    }
}
class Hello69 extends Hai9{
    static int b=99;
    static{
        System.out.println("Hai ->S.B:"+a);
        System.out.println("Hai ->S:B:"+b);
    }
}