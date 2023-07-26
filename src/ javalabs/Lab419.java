public class Lab419 {
    public static void main(String[] args) {


    Demo419 dd = new Demo419() ;

        System.out.println(dd.a) ;



    New419 nn = new New419() ;

         System.out.println(nn.a) ;
        System.out.println(nn.b) ;
}
}

class Demo419 {

    int a = 99 ;
}

class New419 extends Demo419 {
    int b = 88 ;
}

