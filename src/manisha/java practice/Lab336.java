public class Lab336 {
    public static void main(String args[]){
        StudentF stu=new StudentF();
        stu.StudentF(77,"SD");
        stu.show();
    }
}
class StudentF{
    int sid;
    String sname;
    StudentF(int id,String sn){
        System.out.println("Student 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    StudentF(){
        System.out.println("Student Default Constructor");
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
