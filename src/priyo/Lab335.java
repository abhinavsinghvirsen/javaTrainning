package priyo;

public class Lab335 {

    public static void main(String[] args) {

        StudentDetails sd1 = new StudentDetails(1001 ,"Priya","prp@",7008189084l) ;
        sd1.show() ;

        StudentDetails sd2 = new StudentDetails(1001 ,"Priya","p@gmil") ;
        sd2.show() ;

        StudentDetails sd3 = new StudentDetails(1001 ,"Priya") ;
        sd3.show() ;

        StudentDetails sd4 = new StudentDetails() ;
        sd4.show() ;

    }
}

class StudentDetails {

    int s_id ;
    String s_name ;
    String s_email ;
    Long s_phone ;

    StudentDetails(int id ,String name ,String email ,long phone) {

        System.out.println("StudentDet 4-argument constructor ") ;

        s_id = id ;
        s_name = name ;
        s_email = email ;
        s_phone = phone ;


    }

    StudentDetails(int id , String name , String email) {

        System.out.println("Studentdetl 3 -argument constructor") ;

        s_id = id ;
        s_name = name ;
        s_email = email ;

    }

    StudentDetails(int id , String name ) {

        System.out.println("Studentdetl 2-argument constructor") ;

        s_id = id ;
        s_name = name ;


    }

    StudentDetails() {

        System.out.println("Studentdetl default constructor") ;
    }

    void show() {

        System.out.println("student_name = " + s_name +"\t"+ "student_id = "+s_id+"\t"+"Student_email = "+s_email+"\t"+"Student_phneNumber = "+s_phone) ;
    }
}



/*   StudentDet 4-argument constructor
     student_name = Priya	student_id = 1001	Student_email = prp@	Student_phneNumber = 7008189084

     Studentdetl 3 -argument constructor
     student_name = Priya	student_id = 1001	Student_email = p@gmil	Student_phneNumber = null

     Studentdetl 2-argument constructor
     student_name = Priya	student_id = 1001	Student_email = null	Student_phneNumber = null

     Studentdetl default constructor
     student_name = null	student_id = 0	Student_email = null	Student_phneNumber = null

*/

