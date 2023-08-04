public class Lab429 {

    public static void main(String[] args) {

        new New429() ;
    }
}

class Demo429 {
    static int a = 99 ;

    static {
        System.out.println("static block : "+a) ;
    }
}


class New429 extends  Demo429 {
     static int b = 88 ;

     static  {
         System.out.println("New429 : " +a) ;
         System.out.println("New429 : " +b) ;
     }
}
