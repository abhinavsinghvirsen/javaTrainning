package priyo;

public class Lab329 {

    public static void main(String[] args) {

        Student navin = new Student() ;

        navin.s_id = 101 ;
        navin.s_name = "navin pattnaik" ;

        navin.show() ;

    }
}

class Student {

    int s_id ;
    String s_name ;

    void show() {

        System.out.println(s_id + " " + s_name ) ;
    }
}