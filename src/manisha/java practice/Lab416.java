public class Lab416 {
    public static void main(String[]args){
        System.out.println("Hello-main");
    }
}
class Hai{
    public static void main(String[]args){
        System.out.println("Hai-main");
        Hello.main(args);
    }
}