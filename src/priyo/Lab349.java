package priyo;

public class Lab349 {

    public static void main(String[] args) {

        Helloo8 h8 = null ;
        h8.show() ; // null pointer exception [ Cannot invoke "Helloo8.show()" because "h8" is null ]

    }
}

class Helloo8 {

    void show() {

        System.out.println(" show() method ") ;
    }
}