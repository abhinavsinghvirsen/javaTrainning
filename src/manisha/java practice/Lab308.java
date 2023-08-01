public class Lab308 {
    public static void main(String args[]){
        Hello7 h=new Hello7();
        new Hello7();
    }
}
class Hello7{
    {
        System.out.println("Instance Blocked");
    }
    static{
        System.out.println("Static Block");
    }
}
