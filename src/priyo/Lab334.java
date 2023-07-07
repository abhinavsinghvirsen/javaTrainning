package priyo;

public class Lab334 {

    public static void main(String[] args) {

        Student3 std3 = new Student3() ;
        std3.display() ;

        Student3 std = new Student3(111,"arpita") ;
        std.display() ;



    }
}

class Student3 {

    int s_id ;
    String s_name ;

    Student3() {

        System.out.println("student3 default constructor") ;
    }
    Student3(int id,String name) {

        System.out.println("Student3 arg-constructor") ;
        s_id = id ;
        s_name = name ;
    }

    void display() {

        System.out.println(s_id + "\t" + s_name) ;
    }
}


/*   student3 default constructor
     0	null
     Student3 arg-constructor
     111	arpita

*/
