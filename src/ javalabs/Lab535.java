public class Lab535 {

    public static void main(String[] args) {

        Demo535 dd =  new New535() ;

        dd.sleeping() ;
        dd.walking() ;
    }
}
abstract class Demo535 {

    abstract  void sleeping() ;

    abstract  void walking() ;


}

abstract class Test535 extends Demo535 {

    @Override
    void sleeping() {
        System.out.println("TEst535 -> sleeping") ;
    }
}

class New535 extends Test535 {

    @Override
    void walking() {
        System.out.println("New535 -> walking") ;
    }
}
