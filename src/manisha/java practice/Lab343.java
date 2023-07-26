public class Lab343 {
    public static void main(String args[]){
        StudentJ stu1=new StudentJ(88,"Srinivas");
        stu1.show();
        StudentJ stu2=new StudentJ(99, "Dande");
        stu2.show();
    }
}
class StudentJ{
    int sid;
    String sname;
    StudentJ(int sid,String sname){
        System.out.println("Student 2-Arg Constructor");
        this.sid=sid;
        this.sname=sname;
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
