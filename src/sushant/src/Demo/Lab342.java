package Demo;

public class Lab342 {
public static void main(String arg[]) {
	Studentcb stu1=new Studentcb(88,"Srinivas"); 
	stu1.show();
	Studentcb stu2=new Studentcb(99,"Dande"); 
		stu2.show();
	
	}
		}
		class Studentcb{
			int sid; String sname;
			Studentcb(int sid,String sname){
				System.out.println("Student 2-Arg constructor");
			}
			void show() {
				System.out.println(sid+"\t"+sname);
			}
		}
	
	


