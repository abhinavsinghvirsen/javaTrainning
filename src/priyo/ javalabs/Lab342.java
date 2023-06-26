public class Lab342 {

    public static void main(String[] args) {

        Student5 s5 = new Student5(101,"Salman") ;
        s5.show() ;


        Student5 ss5 = new Student5(102,"Sikhar") ;
        ss5.show() ;

    }
}

class Student5 {

    int id ;
    String name ;

    Student5(int id ,String name) {

        System.out.println("Student5 2_args constructor") ;

        this.id = id ;
        this.name = name ;

    }

    void show() {
        System.out.println(id+"\t"+name) ;
    }
}

/*
Student5 2_args constructor
101	Salman

Student5 2_args constructor
102	Sikhar

*/