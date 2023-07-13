package Demo;

public class Lab332 {
	public static void main(String arg[]) {
		Student123 stu=new Student123();
		
		stu.sid=99;
		stu.sname="srinivas";
		stu.show();
		
	}
	}

class Student123{
	int sid;
	String sname;
	Student123(int id,String sn){
		System.out.println("Student 2-Arg constructor");
		sid=id;
		sname=sn;
		
	}
	
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}




