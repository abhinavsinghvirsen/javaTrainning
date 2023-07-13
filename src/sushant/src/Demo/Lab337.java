package Demo;

public class Lab337 {
	public static void main(String arg[]) {
		Studentmnn stu=new Studentmnn();
		stu.Studentmnn(77,"SD");
		stu.show();
	}
	}
class Studentmnn{
	int sid;
	String sname;
	 void Studentmnn(int id,String sn){
	System.out.println("student 2-arg constractor");
	sid=id;
	sname=sn;
	}
	Studentmnn(){
		System.out.println("student default constractor");
		}
	void show() {
		System.out.println(sid+"\t"+sname);
	}
}


