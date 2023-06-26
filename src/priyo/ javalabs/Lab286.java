public class Lab286 {

    public static void main(String[] args) {

    Customer c1 = new Customer() ;
    c1.show() ;

        Customer c2 = new Customer() ;

        c2.c_id =101 ;
        c2.name ="Chandan" ;
        c2.phone = 7008189084l ;
        c2.show();


    }
}

class Customer {

    int c_id ;
    String name ;

    long phone ;

    void show() {

        System.out.println(c_id) ;

        System.out.println(name) ;

        System.out.println(phone) ;


    }
}


