public class Lab431 {
    public static void main(String args[]){
        System.out.println(Hai11.a);
    }
}
class Hai11{
    static int a=99;
    static{
        System.out.println("Hai ->S.B.");
    }
}
class Hello extends Hai11{
    
    static{
        System.out.println("Hello ->S.B.");
    }
}
