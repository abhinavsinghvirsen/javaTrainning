package Demo;

public class Lab330 {
	public static void main(String arg[]) {
		Student12 stu=new Student12();
		
		stu.sid=99;
		stu.sname="srinivas";
		stu.show();
		
	}
	}

class Student12{
	int sid;
	String sname;
	Student12(){
		System.out.println("Student default constructor");
	}
	
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}


