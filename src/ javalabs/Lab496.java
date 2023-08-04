public class Lab496 {

    public static void main(String[] args) {

        Test496 tt = new Test496() ;
        tt.show() ;
    }
}

class Demo496 {

    long show() {
        return 0 ;
    }
}

class Test496 extends Demo496 {

/*    int show() { return type int is not compatable with long

        return  0 ;
    }
*/
}
