public class Lab328 {

    public static void main(String[] args) {

        System.out.println("i am in main() ") ;
        {
            int a = 10 ;
            System.out.println("i am in local block 1 in maqin() : "+a) ;
        }
        int a = 90 ;
        System.out.println("i am main() : "+a) ;
    }
}


/* o/p :-      i am in main()
                i am in local block 1 in maqin() : 10
             i am main() : 90    */

