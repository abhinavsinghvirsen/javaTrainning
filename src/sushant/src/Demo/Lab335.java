package Demo;

public class Lab335 {
	public static void main(String arg[]) {
		Studented stu1=new Studented(99,"Sri","sri@jlc",99999);
		stu1.show();
		Studented stu2=new Studented(88,"Vas","vas@jlc");
		stu2.show();
		Studented stu3=new Studented(77,"SD");
		stu3.show();
		Studented stu4=new Studented();
		stu4.show();
			}
	}
class Studented{
	int sid;
	String sname;
	String email;
	long phone;
	Studented(int id,String sn,String em,long ph){
		System.out.println("Student 4-Arg constructor");
		sid=id;
		sname=sn;
		email=em;
		phone=ph;
	}
	Studented(int id,String sn,String em){
		System.out.println("Student 3-Arg constructor");
		sid=id;
		sname=sn;
		email=em;
	}
	Studented(int id,String sn){
		System.out.println("Student 2-Arg constructor");
		sid=id;
		sname=sn;
	}
	Studented(){
		System.out.println("Student Default constructor");
	}
	void show() {
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
		
	}
}