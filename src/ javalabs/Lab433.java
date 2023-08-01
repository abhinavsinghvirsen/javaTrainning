public class Lab433 {

    public static void main(String[] args) {

         new New433() ;
    }
}

class Demo433 {

     int a = 99 ;
     {
        System.out.println("Demo430 :- Non_static block  "+ a) ;
    }
}


class New433 extends  Demo433 {


    int b = 88 ;

    {
        System.out.println("New429 :-> N.B " +a) ;
        System.out.println("New429 :-> N.B " +b) ;

    }
}


/*Demo430 :- Non_static block  99
        New429 :-> N.B 99
        New429 :-> N.B 88*/



