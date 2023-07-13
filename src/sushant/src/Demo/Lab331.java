package Demo;

public class Lab331 {
	public static void main(String arg[]) {
		Student13 stu=new Student13();
		
		stu.sid=99;
		stu.sname="srinivas";
		stu.show();
		
	}
	}

class Student13{
	int sid;
	String sname;
	Student13(){
		System.out.println("Student default constructor");
	}
	
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}




