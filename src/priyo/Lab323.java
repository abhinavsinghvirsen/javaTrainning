package priyo;

public class Lab323 {

    public static void main(String[] args) {

        new Lab1() ;
        System.out.println("\n **Hello BOys") ; // 3rd
    }
}

class Lab1 {

    static int a ;
    {                 // 2nd this
        System.out.println("\n I am in NB") ;
        {
            System.out.println("I am local block in NB") ;
        }
    }

    static {  // this block call 1st
        System.out.println("\n I am in SIB") ;
        {
            System.out.println("I am local block in SIB") ;
        }
    }
}