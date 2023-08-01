public class Lab323 {
    public static void main(String args[]){
        new Hello5();
        System.out.println("\n**Hello Guys");
    }
}
class Hello5{
    static int a;
    {
        System.out.println("\n I am IIB");
        {
            System.out.println("I am Local Block in IIB");
        }
    }
    static{
        System.out.println("\n I am SIB");
        {
            System.out.println("I am Local Block in SIB");
        }
    }
}
