package priyo;

public class Lab327 {

    public static void main(String[] args) {

        System.out.println("I am in main() ") ;
        int a = 90 ;
        {
            //int a = 10 ;  // Variable 'a' is already defined in the scope

            System.out.println("i am in local block 1 in main() : "+a) ;
        }
    }
}
