public class Lab522 {

    public static void main(String[] args) {

        Person pob = null ;
        pob = new StudentDtl() ;

        StudentDtl std = (StudentDtl)pob ;
        std.reading() ;





        pob = new Employee() ;

        Employee emp = (Employee)pob ;
        emp.working() ;
    }
}
