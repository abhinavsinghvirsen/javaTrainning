package Demo;

public class Lab336 { 
	public static void main(String arg[]) {
		Studentmn stu=new Studentmn();
		stu.Studentmn(77,"SD");
		stu.show();
	}
	}
class Studentmn{
	int sid;
	String sname;
	 Studentmn(int id,String sn){
	System.out.println("student 2-arg constractor");
	sid=id;
	sname=sn;
	}
	Studentmn(){
		System.out.println("student default constractor");
		}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}
