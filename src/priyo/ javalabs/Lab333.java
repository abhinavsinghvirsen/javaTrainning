public class Lab333 {

    public static void main(String[] args) {

        Student2 s2 = new Student2(101 , "susant") ;
        s2.show() ;

        Student2 ss2 = new Student2(999 , "Akash") ;
        ss2.show() ;



    }
}

class Student2 {

    int s_id ;
    String s_name ;

    Student2(int id , String name) {
        System.out.println("student2 parametrized constructor") ;

        s_id = id ;
        s_name = name ;

    }

    void show() {
        System.out.println(s_id +"\t"+s_name) ;
    }
}


    /*  student2 parametrized constructor
        101	susant
        student2 parametrized constructor
        999	Akash   */
