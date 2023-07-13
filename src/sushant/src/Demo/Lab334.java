package Demo;

public class Lab334 {
public static void main(String arg[]) {
	Studentrr stu1=new Studentrr();
	stu1.show();
	Studentrr stu2=new Studentrr(99,"dande");
	 stu2.show();
}
}
class Studentrr{
	int sid;
	String sname;
	Studentrr(){
		System.out.println("student default constructor");
	}
	Studentrr(int id,String sn){
	System.out.println("student 2-arg constructor");
	sid =id;
	sname=sn;
}
void.show(){
	System.out.println(sid+"\t"+sname);
	
	}
}
