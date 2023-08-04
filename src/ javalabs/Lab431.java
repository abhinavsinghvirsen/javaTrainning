public class Lab431 {

    public static void main(String[] args) {

        System.out.println(Demo431.a) ;
    }
}

class Demo431 {

    static int a = 99 ;
    static {
        System.out.println("Demo430 :- static block  ") ;
    }
}


class New431 extends  Demo431 {
    static int b = 88 ;

    static  {
        System.out.println("New429 :-> S.B ") ;

    }
}

/*
Demo430 :- static block
        99

*/
