public class Lab319 {
    public static void main(String args[]){
        Hello1 h=new Hello1();
    }
}
class Hello1{
    {
    int a=10;
    System.out.println("I.Block 1:"+a);
    }
    {
    System.out.println("I.Block 2:"+a);
    }
}
