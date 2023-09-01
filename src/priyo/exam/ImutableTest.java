package java360.exam;

public class ImutableTest {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("bbsr");
        Student s1 = new Student("priyo", 101, sb);

        System.out.println(s1) ;

        sb.append("npr") ;

        System.out.println(s1) ;


    }
}
final class Student {

    private final String student_Name ;

    private final int student_Roll ;

    private final StringBuilder  student_address ;

    public Student(String student_Name, int student_Roll, StringBuilder student_address) {
        this.student_Name = student_Name;
        this.student_Roll = student_Roll;
        this.student_address = new StringBuilder(student_address) ;
    }

    public String getStudent_Name() {

        return student_Name ;
    }

    public int getStudent_Roll() {

        return student_Roll ;
    }

    public StringBuilder getStudent_address() {

        return new StringBuilder(student_address) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Name='" + student_Name + '\'' +
                ", student_Roll=" + student_Roll +
                ", student_address=" + student_address +
                '}';
    }
}
