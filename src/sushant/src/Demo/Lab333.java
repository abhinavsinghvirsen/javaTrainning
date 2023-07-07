package Demo;

public class Lab333 {
	public static void main(String arg[]) {
		Student1234 stu1=new Student1234(88,"srinivas");
		stu1.show();
		Student1234 stu2=new Student1234(99,"dande");
		stu2.show();
			}
	}

class Student1234{
	int sid;
	String sname;
	Student1234(int id,String sn){
		System.out.println("Student 2-Arg constructor");
		sid=id;
		sname=sn;
		
	}
	
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}



