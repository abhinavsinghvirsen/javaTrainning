public class Lab536 {

    public static void main(String[] args) {

        Demo536 dd = new New536() ;
                dd.sleeping() ;

    }
}

abstract class Demo536 {

    abstract void sleeping() ;
}

abstract class Test536 extends Demo536 {

    @Override
    void sleeping() {

        System.out.println("Test536 -> sleeping() ") ;
    }
}

class New536 extends Test536 {

    }

