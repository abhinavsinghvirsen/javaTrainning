public class Lab338 {
    public static void main(String args[]){
        StudentH stu=new StudentH(77,"Lora");
        stu.show();
    }
}
class StudentH{
    int sid;
    String sname;
    void StudentH(int id,String sn){
        System.out.println("Student 2-Arg Constructor");
        sid=id;
        sname=sn;
    }
    
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
