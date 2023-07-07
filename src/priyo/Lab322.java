package priyo;

public class Lab322 {

    public static void main(String[] args) {

        System.out.println("\n main : " + Old.a) ;

    }
}


class Old {

    static int a ;

    {
        System.out.println("\n I am NB") ;
        {
            System.out.println("I am local block in NB") ;
        }
    }

    static {
        System.out.println("\n I am in SIB") ;
        {
            System.out.println("I am  local block in SIB");
        }
    }



}