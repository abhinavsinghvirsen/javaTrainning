public class Lab430 {
    public static void main(String args[]){
        System.out.println(Hello70.a);
    }
}
class Hai10{
    static{
        System.out.println("Hai ->S.B.");
    }
}
class Hello70 extends Hai10{
    static int a=99;
    static{
        System.out.println("Hai ->S.B.");
    }
}
