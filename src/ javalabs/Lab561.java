public class Lab561 {

    public static void main(String[] args) {

        InheritA aobj = new InheritD() ;

        InheritB bobj = new InheritB() ;

        InheritD dobj = new InheritD() ;

        InheritC cobj = new InheritC() ;

        System.out.println(aobj == dobj) ;

        System.out.println(aobj == bobj) ;

        System.out.println(aobj == cobj) ;
    }
}
