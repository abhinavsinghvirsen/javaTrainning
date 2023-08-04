public class Lab333 {
    public static void main(String args[]){
        StudentC stu1=new StudentC(88,"MANISA");
        stu1.show();
        StudentC stu2=new StudentC(99, "ABINASH");
        stu2.show();
    }
}
class StudentC{
    int sid;
    String sname;
    StudentC(int id,String sn){
        System.out.println("StudentC 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
