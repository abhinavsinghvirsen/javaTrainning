public class Lab302 {
    public static void main(String args[]){
        Hy h=new Hy();
        System.out.println("Main:"+h.a);
    }
}
class Hy{
    int a;
    {
        a=10;
        System.out.println("Initialized:"+a);
    }
    
}

