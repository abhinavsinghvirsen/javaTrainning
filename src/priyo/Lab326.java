package priyo;

public class Lab326 {

    public static void main(String[] args) {

        System.out.println("i am main()") ;
        {
            int a = 10 ;
            System.out.println("I am local block 1 in main() : " + a) ;
        }
        {
            int a = 20;
            System.out.println("I am local Block 2 in main() : "+a) ;
        }
        {
            String a = "jlc" ;
            System.out.println("I am in block 3 in main() : "+a) ;
        }


        /* O.P :-   i am main()
                   I am local block 1 in main() : 10
                   I am local Block 2 in main() : 20
                   I am in block3 in main() : jlc       */

    }
}
