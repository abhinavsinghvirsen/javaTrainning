public class Lab557 {

    public static void main(String[] args) {

        InheritA aobj = new InheritD() ;

        if(aobj instanceof InheritC) {

            InheritC cobj = (InheritC) aobj;

        }

        System.out.println("Hello Guys") ;
    }
}
