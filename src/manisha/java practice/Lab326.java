public class Lab326 {
    public static void main(String args[]){
        System.out.println("I am Main()");
        {
            int a=10;
            System.out.println("I am Local Block1 in Main():"+a);
        }
        {
            int a=20;
            System.out.println("I am Local Block 2 in Main():"+a);
        }
    
        {
            String a="JLC";
            System.out.println("I am Local Block 3 in Main():"+a);
        }
    }    
}

