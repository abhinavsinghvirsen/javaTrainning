public class Lab432 {
    public static void main(String args[]){
        System.out.println(Hello71.a);
    }
}
class Hai12{
    static int a=99;
    static{
        System.out.println("Hai->S.B.");
    }
}
class Hello71 extends Hai12{
    
    static{
        System.out.println("Hello ->S.B.");
    }
}