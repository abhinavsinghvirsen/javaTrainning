package priyo;

public class Lab325 {

    public static void main(String[] args) {

        Lab2 lb = new Lab2() ;
      //  System.out.println("Main : "+ lb.a) ; cannot resolve symbol a .

    }
}



class Lab2 {

    {
        int a = 10;
        String s =
                "jls";

        System.out.println("1.Block : "+ a ) ;
    }


}