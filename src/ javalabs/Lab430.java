public class Lab430 {

    public static void main(String[] args) {

        System.out.println(New430.b) ;
    }
}

class Demo430 {

    static {
        System.out.println("Demo430 :- static block  ") ;
    }
}


class New430 extends  Demo430 {
    static int b = 88 ;

    static  {
        System.out.println("New429 :-> S.B ") ;

    }
}


/*
Demo430 :- static block
        New429 :-> S.B
        88
*/
