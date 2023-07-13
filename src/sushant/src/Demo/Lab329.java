package Demo;

public class Lab329 {
	public static void main(String arg[]) {
		Student1 stu1=new Student1();
		stu1.show();
		Student1 stu2=new Student1();
		stu2.show();
	}
}
class Student1{
	int sid;
	String sname;
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}
