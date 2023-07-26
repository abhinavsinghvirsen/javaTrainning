public class Lab436 {
    public static void main(String args[]){
        Hello74.show();
    }
}
class Hai16{
    static void show(){
        System.out.println("Hai -> show");
    }
    static{
        System.out.println("Hai ->S.B");
    }
}
class Hello74 extends Hai16{
    static{
        System.out.println("Hello -> S.B");
    }
}