public class Lab297 {
    public static void main(String args[]){
        new Bye().b=99;
        System.out.println(new Bye().b);

    }
}
class Bye{
    static int b;
}
