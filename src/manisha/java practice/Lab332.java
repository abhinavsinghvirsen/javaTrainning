public class Lab332 {
    public static void main(String args[]){
        StudentB stu=new StudentB();
        stu.sid=99;
        stu.sname="Manisa";
        stu.show();
    }
}
class StudentB{
    int sid;
    String sname;
    StudentB(int id,String sn){
        System.out.println("StudentB 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
