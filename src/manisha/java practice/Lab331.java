public class Lab331 {
    public static void main(String args[]){
        StudentA stu=new StudentA();
        stu.sid=99;
        stu.sname="Abinash";
        stu.show();
    }
}
class StudentA{
    int sid;
    String sname;
    StudentA(){
        System.out.println("Student Default Constructor");
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
