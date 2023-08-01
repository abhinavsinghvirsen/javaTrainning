public class Lab528 {

    public static void main(String[] args) {

        Test528 tt = new Test528() ;  tt.show() ;


        tt.x = true ;
        New528 ref = tt ;   ref.x = "SRI" ;

        Demo528 ref2 = tt ;  ref2.x = 88 ;

        tt.show() ;
    }
}

class Demo528 {

    int x = 9 ;
}

class New528 extends Demo528
{
    String x = "jlc" ;
}
class Test528 extends  New528 {

    boolean x = false ;

    void show() {
        char x = 'j' ;

        New528 ref = this ;
        Test528 ref1 = this ;
        Demo528 ref2 = this ;

        System.out.println(ref.x+"\t"+ref1.x+"\t"+ref2.x) ;

    }
}
