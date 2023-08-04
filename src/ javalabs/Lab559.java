public class Lab559 {

    public static void main(String[] args) {
        InheritA aobj = new InheritD() ;

        System.out.println(aobj instanceof  InheritA) ;

        System.out.println(aobj instanceof InheritB) ;

        System.out.println(aobj instanceof InheritC) ;

        System.out.println(aobj instanceof InheritD) ;
    }
}
