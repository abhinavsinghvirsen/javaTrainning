public class Lab332 {

    public static void main(String[] args) {

//        Stud std = new Stud() ; // error
//
//        std.s_name = "Priyaranjan" ;
//        std.s_id = 103 ;
//
//        std.show() ;

    }
}

class Stud {

    int s_id ;
    String s_name ;

    Stud(int id , String name) {

        System.out.println("stud default constructor ") ;

        s_id = id ;
        s_name = name ;
    }

    void show() {

        System.out.println(s_id + " " + s_name) ;
    }
}
