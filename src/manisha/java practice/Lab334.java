public class Lab334 {
    public static void main(String args[]){
        StudentD stu1=new StudentD();
        stu1.show();
        StudentD stu2=new StudentD(99, "Dande");
        stu2.show();
    }
}
class StudentD{
    int sid;
    String sname;
    StudentD(){
        System.out.println("Student Default Constructor");
    }
    StudentD(int id,String sn){
        System.out.println("Student 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
