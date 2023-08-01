public class Lab342 {
    public static void main(String args[]){
        StudentI stu1=new StudentI(88,"Srinivas");
        stu1.show();
        StudentI stu2=new StudentI(99, "Dande");
        stu2.show();
    }
}
class StudentI{
    int sid;
    String sname;
    StudentI(int sid,String sname){
        System.out.println("Student 2-Arg Constructor");
        sid=sid;
        sname=sname;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
