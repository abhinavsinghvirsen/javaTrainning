public class Lab545 {

    public static void main(String[] args) {

        System.out.println("Hello Guys") ;

        Demo545 dd = null ;


        dd = new New545() ;

        dd.m1() ;

        dd.m2() ;

   //     dd.m3() ; Cannot resolve method 'm3' in 'Demo545'


    }
}

interface Demo545 {

    void m1() ;

    public abstract void m2() ;

    int A = 19 ;

    public final static  int B = 20 ;

}


 abstract class Test545 implements Demo545{

    @Override

    public void m1() {
        System.out.println("m1() method : "+A) ;
    }



}

class New545 extends  Test545 {

    @Override
    public void m2() {
        System.out.println("m2 method : "+B) ;
    }

    void m3() {
        System.out.println("New545 -> m3()") ;
    }
}
