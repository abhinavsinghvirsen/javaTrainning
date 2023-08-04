public class Lab316 {
    public static void main(String args[]){
        Helloo h=new Helloo();
        System.out.println("Main:"+h.a);
    }
}
class Helloo{
    int a=10;
    {
        System.out.println("I.Block 1:"+a);
    }
    {
        System.out.println("I.Block 2:"+a);
    }
}
