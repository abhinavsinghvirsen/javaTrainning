public class Lab330 {
    public static void main(String args[]){
        Studentm stu=new Studentm();
        stu.sid=99;
        stu.sname="Manisa";
        stu.show();
    }
}
class Studentm{
    int sid;
    String sname;
    Studentm(){
        System.out.println("Student Default Constructor");
    }
    void show(){
        System.out.println(sid+"\t"+sname);
    }
}
