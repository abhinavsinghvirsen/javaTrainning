package priyo;

public class Lab361 {

    public static void main(String[] args) {

        Demo361 d1 = new Demo361() ;

        int x = d1.show(10) ;

       System.out.println(x) ;
    }
}


class Demo361 {

    int show(int x) {

        return x+1 ;
    }
}