public class Lab322 {
    public static void main(String args[]){
        System.out.println("\n Main:"+Hello4.a);
    }
}
class Hello4{
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
