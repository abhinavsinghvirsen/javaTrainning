public class Lab337 {
    public static void main(String args[]){
        StudentG stu=new StudentG();
        stu.StudentG(77,"SD");
        stu.show();
    }
}
class StudentG{
    int sid;
    String sname;
    void StudentG(int id,String sn){
        System.out.println("Student 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    StudentG(){
        System.out.println("Student Default Constructor");
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
