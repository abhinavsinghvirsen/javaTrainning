public class Lab552 {

    public static void main(String[] args) {

    }
}

interface Demo552 {
    void show() ;
}

interface Test552  {
    int show() ;
}

class New552 implements Demo552 {

    @Override
    public void show() {

    }
}

class Fun552 implements Test552 {

    @Override
    public int show() {

        return 0;
    }
}

// class Fun_552 implements Demo552,Test552 {
//
//  /*  @Override
//    public void show() {
//
//    }
//
//    public int show() {
//        return 2 ;
//    }*/
//}
//

