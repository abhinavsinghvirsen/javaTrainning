public class Lab328 {
    public static void main(String args[]){
        System.out.println("I am Main()");
        {
            int a=10;
            System.out.println("I am Local Block1 in Main():"+a);
        }
        {
            int a=90;
            System.out.println("I am Main():"+a);
        }
    }    
}
