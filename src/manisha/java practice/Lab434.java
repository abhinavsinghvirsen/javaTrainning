public class Lab434 {
    public static void main(String args[]){
        Hello73 h=new Hello73();
    }
}
class Hai14{
    {
        System.out.println("Hai ->I.B:");
    }
    static{
        System.out.println("Hai ->S.B:");
    }
}
class Hello73 extends Hai14{
    {
        System.out.println("Hello -> I.B");
    }
    static{
        System.out.println("Hello -> S.B");
    }
}