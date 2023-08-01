public class Lab432 {

    public static void main(String[] args) {

        System.out.println(New432.a) ;
    }
}

class Demo432 {

     static int a = 99 ;
    static {
        System.out.println("Demo430 :- static block  ") ;
    }
}


class New432 extends  Demo432 {


    static  {
        System.out.println("New429 :-> S.B ") ;

    }
}

