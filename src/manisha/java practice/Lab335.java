public class Lab335 {
    public static void main(String args[]){
        StudentE stu1=new StudentE(99,"Sri","sri@jlc",99999);
        stu1.show();
        StudentE stu2=new StudentE(88, "Vas","vas@jlc");
        stu2.show();
        StudentE stu3=new StudentE(77, "SD");
        stu3.show();
        StudentE stu4=new StudentE();
        stu4.show();
        
    }
}
class StudentE{
    int sid;
    String sname;
    String email;
    long phone;
    StudentE(int id,String sn,String em,long ph){
        System.out.println("Student 4-Arg Constructor");
        sid=id;
        sname=sn;
        email=em;
        phone=ph;
    }
    StudentE(int id,String sn,String em){
        System.out.println("Student 3-Arg Constructor");
        sid=id;
        sname=sn;
        email=em;
    }
    StudentE(int id,String sn){
        System.out.println("Student 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    StudentE(){
        System.out.println("Student Default Constructor");
    }
    void show(){
        System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
    }
}
